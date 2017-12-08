package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bitronix.tm.BitronixTransactionManager;
import bitronix.tm.TransactionManagerServices;

public class DBHelper {

	private final String DB_NAME = "advandb_mco3";
	private final String USERNAME = "ADVANDB";
	private final String MY_USERNAME = "root";
	private final String PASSWORD = "1234";

	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String URL_CELINA = "jdbc:mysql://192.168.1.2:3306";
	private static final String URL_JOLENE = "jdbc:mysql://192.168.1.3:3306";
	private static final String URL_JILYAN = "jdbc:mysql://192.168.1.4:3306";
	
	private DBConnection connection;
	
	private BitronixTransactionManager btm;

	public DBHelper() {
		connection.setConnection(DB_NAME, USERNAME, PASSWORD);
		this.connection = DBConnection.getInstance();
		
		/*---------From CodeProject.com START---------
		PoolingDataSource mySQLDS = new PoolingDataSource();
		mySQLDS.setClassName("com.mysql.jdbc.jdbc2.optional.MysqlXADataSource");
		mySQLDS.setUniqueName("mySqlBtm");
		mySQLDS.setMaxPoolSize(3);
		mySQLDS.getDriverProperties().setProperty("databaseName", DB_NAME);
		mySQLDS.init();
		---------From CodeProject.com END---------*/
		
		btm = TransactionManagerServices.getTransactionManager();
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
	public ArrayList<String> getAllRegions() {
		ArrayList<String> regions = new ArrayList<>();

		String query = "SELECT DISTINCT " + Record.COL_REGION
				+ " FROM " + Record.TABLE;

		try {
			ResultSet rs = connection.executeQuery(query);

			while (rs.next()) {
				regions.add(rs.toString());
			}

			rs.close();

			System.out.println("[REGIONS] SELECT SUCCESS!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("[REGIONS] SELECT FAILED!");
			return null;
		}

		return regions;
	}

	// TODO Select one region only
	public ArrayList<Record> getAllCountryRowByRegion(String region) {
		ArrayList<Record> countrieRows = new ArrayList<>();

		String query = "SELECT * "
				+ "FROM " + Record.TABLE
				+ "WHERE " + Record.COL_REGION +" = " + region;

		try {
			ResultSet rs = connection.executeQuery(query);

			while (rs.next()) {
				countrieRows.add(toRecord(rs));
			}

			rs.close();

			System.out.println("[COUNTRY] SELECT SUCCESS!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("[COUNTRY] SELECT FAILED!");
			return null;
		}

		return countrieRows;
	}

	// TODO Insert
	public boolean addRecord(Record record) {
		String query = 	"INSERT INTO " + Record.TABLE + 
						" VALUES (?, ?, ?, ?)";
		
		try {
			/*---------TRANSACTION MANAGER STUFF START---------*/
			btm.begin();
			
			Connection c1 = null;
			Connection c2 = null;
			Connection c3 = null;
			
			c1 = DriverManager.getConnection(URL_CELINA + "/" + DB_NAME, USERNAME, PASSWORD);
			c2 = DriverManager.getConnection(URL_JOLENE + "/" + DB_NAME, USERNAME, PASSWORD);
			c3 = DriverManager.getConnection(URL_JILYAN + "/" + DB_NAME, USERNAME, PASSWORD);
			
			PreparedStatement p1 = c1.prepareStatement(query);
			p1.setString(2, record.getRegion());
			p1.setString(3, record.getCountry());
			p1.setString(4, record.getYear());
			p1.setDouble(5, record.getValue());
			
			PreparedStatement p2 = c2.prepareStatement(query);
			p2.setString(2, record.getRegion());
			p2.setString(3, record.getCountry());
			p2.setString(4, record.getYear());
			p2.setDouble(5, record.getValue());
			
			PreparedStatement p3 = c3.prepareStatement(query);
			p3.setString(2, record.getRegion());
			p3.setString(3, record.getCountry());
			p3.setString(4, record.getYear());
			p3.setDouble(5, record.getValue());
			
			p1.executeUpdate();
			p2.executeUpdate();
			p3.executeUpdate();
			
			//connection.closePreparedStatement();
			p1.close();
			p2.close();
			p3.close();
			
			c1.close();
			c2.close();
			c3.close();
			
			btm.commit();
			/*---------TRANSACTION MANAGER STUFF END---------*/
			
			System.out.println("[RECORD] INSERT SUCCESS!");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			System.out.println("[RECORD] INSERT FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		return false;
	}
	
	// TODO Update
	public boolean updateRecord(Record record) {
		try {
			String query = 	"UPDATE " + Record.TABLE +
							" SET " + Record.COL_REGION + " = ?, " +
							Record.COL_COUNTRY + " = ?, " + 
							Record.COL_YEAR + " = ?, " +
							Record.COL_DATA + " = ? " +
							" WHERE " + Record.COL_ID + " = ?";
			
			/*---------TRANSACTION MANAGER STUFF START---------*/
			btm.begin();
			
			Connection c1 = null;
			Connection c2 = null;
			Connection c3 = null;
			
			c1 = DriverManager.getConnection(URL_CELINA + "/" + DB_NAME, USERNAME, PASSWORD);
			c2 = DriverManager.getConnection(URL_JOLENE + "/" + DB_NAME, USERNAME, PASSWORD);
			c3 = DriverManager.getConnection(URL_JILYAN + "/" + DB_NAME, USERNAME, PASSWORD);
			
			PreparedStatement p1 = c1.prepareStatement(query);
			p1.setString(1, record.getRegion());
			p1.setString(2, record.getCountry());
			p1.setString(3, record.getYear());
			p1.setDouble(4, record.getValue());
			p1.setInt(5, record.getId());
			
			PreparedStatement p2 = c2.prepareStatement(query);
			p2.setString(1, record.getRegion());
			p2.setString(2, record.getCountry());
			p2.setString(3, record.getYear());
			p2.setDouble(4, record.getValue());
			p2.setInt(5, record.getId());
			
			PreparedStatement p3 = c3.prepareStatement(query);
			p3.setString(1, record.getRegion());
			p3.setString(2, record.getCountry());
			p3.setString(3, record.getYear());
			p3.setDouble(4, record.getValue());
			p3.setInt(5, record.getId());
			
			p1.executeUpdate();
			p2.executeUpdate();
			p3.executeUpdate();

			//connection.closePreparedStatement();
			p1.close();
			p2.close();
			p3.close();
			
			c1.close();
			c2.close();
			c3.close();
			
			btm.commit();
			/*---------TRANSACTION MANAGER STUFF END---------*/
			
			System.out.println("[RECORD] UPDATE SUCCESS! ");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			System.out.println("[RECORD] UPDATE FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		return false;
	}
	
	// TODO Delete
	public boolean deleteRecord(int id) {
		String query = 	"DELETE FROM " + 
						Record.TABLE +
						" WHERE " + Record.COL_ID + " = ?";
		
		try {
			/*---------TRANSACTION MANAGER STUFF START---------*/
			btm.begin();
			
			Connection c1 = null;
			Connection c2 = null;
			Connection c3 = null;
			
			c1 = DriverManager.getConnection(URL_CELINA + "/" + DB_NAME, USERNAME, PASSWORD);
			c2 = DriverManager.getConnection(URL_JOLENE + "/" + DB_NAME, USERNAME, PASSWORD);
			c3 = DriverManager.getConnection(URL_JILYAN + "/" + DB_NAME, USERNAME, PASSWORD);
			
			PreparedStatement p1 = c1.prepareStatement(query);
			p1.setInt(1, id);
			
			PreparedStatement p2 = c2.prepareStatement(query);
			p2.setInt(1, id);
			
			PreparedStatement p3 = c3.prepareStatement(query);
			p3.setInt(1, id);
			
			p1.executeUpdate();
			p2.executeUpdate();
			p3.executeUpdate();
			
			//connection.closePreparedStatement();
			p1.close();
			p2.close();
			p3.close();
			
			c1.close();
			c2.close();
			c3.close();
			
			btm.commit();
			/*---------TRANSACTION MANAGER STUFF END---------*/
			
			System.out.println("[RECORD] DELETE SUCCESS!");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			System.out.println("[RECORD] DELETE FAILED!");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("[BTM] SYSTEM EXCEPTION");
			try {
				btm.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("[BTM] ROLLBACK FAILURE");
			}
		}
		return false;
	}
}
