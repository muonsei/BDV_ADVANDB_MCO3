package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import javax.transaction.Status;

import bitronix.tm.BitronixTransactionManager;
import bitronix.tm.TransactionManagerServices;
import javafx.animation.KeyValue.Type;

public class DBHelper {

	private BitronixTransactionManager btm;

	public DBHelper(BitronixTransactionManager btm) {

		this.btm = btm;
		/*---------From CodeProject.com START---------
		 PoolingDataSource mySQLDS = new PoolingDataSource();
		 mySQLDS.setClassName("com.mysql.jdbc.jdbc2.optional.MysqlXADataSource");
		 mySQLDS.setUniqueName("mySqlBtm");
		 mySQLDS.setMaxPoolSize(3);
		 mySQLDS.getDriverProperties().setProperty("databaseName", DB_NAME);
		 mySQLDS.init();
		 ---------From CodeProject.com END---------*/
		//btm = TransactionManagerServices.getTransactionManager();
	}

	private Record toRecord(ResultSet rs) throws SQLException {
		Record record = new Record();

		record.setId(rs.getInt(Record.COL_ID));
		record.setCountry(rs.getString(Record.COL_COUNTRY));
		record.setRegion(rs.getString(Record.COL_REGION));
		record.setYear(rs.getString(Record.COL_YEAR));
		record.setValue(rs.getDouble(Record.COL_DATA));

		return record;
	}

	// TODO Select all distinct regions
	public ArrayList<String> getAllRegions(Connection connection) {
		ArrayList<String> regions = new ArrayList<>();

		String query = "SELECT DISTINCT " + Record.COL_REGION
				+ " FROM " + Record.TABLE_AR;

		try {
			//while(btm.getStatus()==Status.STATUS_ACTIVE);
			btm.begin();
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				regions.add(rs.getString(Record.COL_REGION));
			}

			rs.close();
			statement.close();
			connection.close();
			btm.commit();
			
			System.out.println("[COUNTRY] SELECT SUCCESS!");
		} catch (SQLException ev) {
			ev.printStackTrace();
			btm.shutdown();
			System.out.println("[COUNTRY] SELECT FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			btm.shutdown();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				btm.shutdown();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		//btm.shutdown();
		return regions;
	}

	// TODO Select one region only
	public ArrayList<Record> getAllCountryRowByRegion(Connection connection, String region) {
		ArrayList<Record> countrieRows = new ArrayList<>();

		String query = "SELECT * "
				+ " FROM " + Record.TABLE_AR
				+ " WHERE " + Record.COL_REGION + " = \"" + region + "\"";

		try {
			//while(btm.getStatus()==Status.STATUS_ACTIVE);
			btm.begin();
			
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				countrieRows.add(toRecord(rs));
			}

			rs.close();
			statement.close();
			connection.close();
			
			btm.commit();

			System.out.println("[COUNTRY] SELECT SUCCESS!");
		} catch (SQLException ev) {
			ev.printStackTrace();
			btm.shutdown();
			System.out.println("[COUNTRY] SELECT FAILED!");
			//btm.shutdown();
		} catch (Exception ex) {
			ex.printStackTrace();
			btm.shutdown();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				btm.shutdown();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		return countrieRows;
	}

	// TODO Insert
	public boolean addRecord(Connection connection, Record record, String table) {
		String query = "INSERT INTO " + table
				+ " VALUES (?, ?, ?, ?, ?)";

		try {
			/*---------TRANSACTION MANAGER STUFF START---------*/
			btm.begin();

			PreparedStatement statement = connection.prepareStatement(query);
			statement.setNull(1, Types.INTEGER);
			statement.setString(2, record.getRegion());
			statement.setString(3, record.getCountry());
			statement.setString(4, record.getYear());
			statement.setDouble(5, record.getValue());

			statement.executeUpdate();

			//connection.closePreparedStatement();
			statement.close();
			connection.close();

			btm.commit();
			/*---------TRANSACTION MANAGER STUFF END---------*/

			System.out.println("[RECORD] INSERT SUCCESS!");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			btm.shutdown();
			System.out.println("[RECORD] INSERT FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			btm.shutdown();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				btm.shutdown();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		return false;
	}

	// TODO Update
	public boolean updateRecord(Connection connection, Record record, String table) {
		try {
			String query = "UPDATE " + table
					+ " SET " + Record.COL_DATA + " = ? "
					+ " WHERE " + Record.COL_COUNTRY + " = ? AND "
					+ Record.COL_YEAR + " = ? AND "
					+ Record.COL_REGION + " = ? ";

			/*---------TRANSACTION MANAGER STUFF START---------*/
			btm.begin();

			PreparedStatement statement = connection.prepareStatement(query);
			statement.setDouble(1, record.getValue());
			statement.setString(2, record.getCountry());
			statement.setString(3, record.getYear());
			statement.setString(4, record.getRegion());

			statement.executeUpdate();

			//connection.closePreparedStatement();
			statement.close();
			connection.close();

			btm.commit();
			/*---------TRANSACTION MANAGER STUFF END---------*/

			System.out.println("[RECORD] UPDATE SUCCESS! ");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			btm.shutdown();
			System.out.println("[RECORD] UPDATE FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			btm.shutdown();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				btm.shutdown();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		return false;
	}

	// TODO Delete
	public boolean deleteRecord(Connection connection, Record record, String table) {
		String query = "DELETE FROM " + table
				+ " WHERE " + Record.COL_COUNTRY + " = ? AND "
				+ Record.COL_YEAR + " = ? AND "
				+ Record.COL_REGION + " = ? AND "
				+ Record.COL_DATA + " = ? ";

		try {
			/*---------TRANSACTION MANAGER STUFF START---------*/
			btm.begin();

			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, record.getCountry());
			statement.setString(2, record.getYear());
			statement.setString(3, record.getRegion());
			statement.setDouble(4, record.getValue());


			statement.executeUpdate();

			//connection.closePreparedStatement();
			statement.close();
			connection.close();

			btm.commit();
			/*---------TRANSACTION MANAGER STUFF END---------*/

			System.out.println("[RECORD] DELETE SUCCESS!");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			btm.shutdown();
			System.out.println("[RECORD] DELETE FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			btm.shutdown();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("[BTM] ROLLBACK FAILURE");
				btm.shutdown();
			}
		}
		return false;
	}
}
