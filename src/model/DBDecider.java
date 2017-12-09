package model;

import java.sql.Connection;
import java.util.ArrayList;

import bitronix.tm.BitronixTransactionManager;
import java.sql.SQLException;

/**
 *
 * @author Jilyan
 */
public class DBDecider {

	private final String DB_NAME_AA_EA = "advandb_aa";
	private final String DB_NAME_AR_AA = "advandb_ar";
	private final String DB_NAME_EA_AR = "advandb_ea";
	private final String USERNAME = "ADVANDB";
	private final String MY_USERNAME = "root";
	private final String PASSWORD = "1234";

	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
//	private static final String URL_AR_AA = "jdbc:mysql://192.168.1.2:3306"; // CELINA
//	private static final String URL_EA_AR = "jdbc:mysql://192.168.1.3:3306"; // JOLENE
//	private static final String URL_AA_EA = "jdbc:mysql://192.168.1.4:3306"; // JILYAN

	private static final String URL_AR_AA = "jdbc:mysql://192.168.151.2:3306";
	private static final String URL_EA_AR = "jdbc:mysql://192.168.151.2:3306";
	private static final String URL_AA_EA = "jdbc:mysql://192.168.151.2:3306";

	private static DBHelper dbHelper;
	private DBConnection connection1;
	private DBConnection connection2;
	private DBConnection connection3;
	private DBConnection connection4;
	private BitronixTransactionManager btm;

	public DBDecider(BitronixTransactionManager btm) {
		this.btm = btm;
		dbHelper = new DBHelper(btm);
	}

	public ArrayList<String> getAllRegions() {
		connection1 = DBConnection.getInstance();
		connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
		return dbHelper.getAllRegions(connection1.getConnection());
	}

	public ArrayList<Record> getAllCountryRowByRegion(String region) {
		connection1 = DBConnection.getInstance();
		connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
		return dbHelper.getAllCountryRowByRegion(connection1.getConnection(), region);
	}

	public boolean addRecord(Record record) throws SQLException {
		connection1 = DBConnection.getInstance();
		connection2 = DBConnection.getInstance();
		connection3 = DBConnection.getInstance();
		connection4 = DBConnection.getInstance();

		boolean success = false;

		if (record.getRegion().equalsIgnoreCase("Europe & Central Asia")
				|| record.getRegion().equalsIgnoreCase("Latin America & Caribbean")
				|| record.getRegion().equalsIgnoreCase("North America")) {
			// EUROPE AND AMERICA

			connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection1.getConnection(), record, Record.TABLE_AR);

			if (success) {
				connection2.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection2.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				return false;
			}

			if (success) {
				connection3.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection3.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				return false;
			}

			if (success) {
				connection4.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection4.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				return false;
			}

			if (!success) {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				connection4.getConnection().rollback();
				connection4.getConnection().close();
				return false;
			}

		} else if (record.getRegion().equalsIgnoreCase("East Asia & Pacific")
				|| record.getRegion().equalsIgnoreCase("Middle East & North Africa")
				|| record.getRegion().equalsIgnoreCase("South Asia")
				|| record.getRegion().equalsIgnoreCase("Sub-Saharan Africa")) {
			// ASIA AND AFRICA

			connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection1.getConnection(), record, Record.TABLE_AA);

			if (success) {
				connection2.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection2.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				return false;
			}
			if (success) {
				connection3.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection3.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				return false;
			}
			if (success) {
				connection4.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection4.getConnection(), record, Record.TABLE_AA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				return false;
			}

			if (!success) {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				connection4.getConnection().rollback();
				connection4.getConnection().close();
				return false;
			}

		}

		return success;
	}

	public boolean updateRecord(Record record) throws SQLException {
		connection1 = DBConnection.getInstance();
		connection2 = DBConnection.getInstance();
		connection3 = DBConnection.getInstance();
		connection4 = DBConnection.getInstance();

		boolean success = false;

		if (record.getRegion().equalsIgnoreCase("Europe & Central Asia")
				|| record.getRegion().equalsIgnoreCase("Latin America & Caribbean")
				|| record.getRegion().equalsIgnoreCase("North America")) {
			// EUROPE AND AMERICA

			connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection1.getConnection(), record, Record.TABLE_AR);

			if (success) {
				connection2.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.updateRecord(connection2.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				return false;
			}

			if (success) {
				connection3.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.updateRecord(connection3.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				return false;
			}

			if (success) {
				connection4.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.updateRecord(connection4.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				return false;
			}

			if (!success) {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				connection4.getConnection().rollback();
				connection4.getConnection().close();
				return false;
			}

		} else if (record.getRegion().equalsIgnoreCase("East Asia & Pacific")
				|| record.getRegion().equalsIgnoreCase("Middle East & North Africa")
				|| record.getRegion().equalsIgnoreCase("South Asia")
				|| record.getRegion().equalsIgnoreCase("Sub-Saharan Africa")) {
			// ASIA AND AFRICA

			connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection1.getConnection(), record, Record.TABLE_AA);

			if (success) {
				connection2.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
				success = dbHelper.updateRecord(connection2.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				return false;
			}

			if (success) {
				connection3.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.updateRecord(connection3.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				return false;
			}

			if (success) {
				connection4.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.updateRecord(connection4.getConnection(), record, Record.TABLE_AA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				return false;
			}

			if (!success) {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				connection4.getConnection().rollback();
				connection4.getConnection().close();
				return false;
			}

		}

		return success;
	}

	public boolean deleteRecord(Record record) throws SQLException {
		connection1 = DBConnection.getInstance();
		connection2 = DBConnection.getInstance();
		connection3 = DBConnection.getInstance();
		connection4 = DBConnection.getInstance();

		boolean success = false;

		if (record.getRegion().equalsIgnoreCase("Europe & Central Asia")
				|| record.getRegion().equalsIgnoreCase("Latin America & Caribbean")
				|| record.getRegion().equalsIgnoreCase("North America")) {
			// EUROPE AND AMERICA

			connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection1.getConnection(), record, Record.TABLE_AR);

			if (success) {
				connection2.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.deleteRecord(connection2.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				return false;
			}

			if (success) {
				connection2.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.deleteRecord(connection3.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				return false;
			}

			if (success) {
				connection4.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.deleteRecord(connection4.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				return false;
			}

			if (!success) {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				connection4.getConnection().rollback();
				connection4.getConnection().close();
				return false;
			}

		} else if (record.getRegion().equalsIgnoreCase("East Asia & Pacific")
				|| record.getRegion().equalsIgnoreCase("Middle East & North Africa")
				|| record.getRegion().equalsIgnoreCase("South Asia")
				|| record.getRegion().equalsIgnoreCase("Sub-Saharan Africa")) {
			// ASIA AND AFRICA
			connection1.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection1.getConnection(), record, Record.TABLE_AA);

			if (success) {
				connection2.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
				success = dbHelper.deleteRecord(connection2.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				return false;
			}

			if (success) {
				connection3.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.deleteRecord(connection3.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				return false;
			}

			if (success) {
				connection4.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.deleteRecord(connection4.getConnection(), record, Record.TABLE_AA);
			} else {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				return false;
			}

			if (!success) {
				//rollback
				connection1.getConnection().rollback();
				connection1.getConnection().close();
				connection2.getConnection().rollback();
				connection2.getConnection().close();
				connection3.getConnection().rollback();
				connection3.getConnection().close();
				connection4.getConnection().rollback();
				connection4.getConnection().close();
				return false;
			}
		}
		return success;
	}

}
