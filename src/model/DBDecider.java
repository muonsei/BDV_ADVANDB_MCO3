package model;

import java.sql.Connection;
import java.util.ArrayList;

import bitronix.tm.BitronixTransactionManager;

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
	private DBConnection connection;
	private BitronixTransactionManager btm;

	public DBDecider(BitronixTransactionManager btm) {
		this.btm = btm;
		dbHelper = new DBHelper(btm);
	}

	public ArrayList<String> getAllRegions() {
		connection = DBConnection.getInstance();
		connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
		return dbHelper.getAllRegions(connection.getConnection());
	}

	public ArrayList<Record> getAllCountryRowByRegion(String region) {
		connection = DBConnection.getInstance();
		connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
		return dbHelper.getAllCountryRowByRegion(connection.getConnection(), region);
	}

	public boolean addRecord(Record record) {
		connection = DBConnection.getInstance();
		boolean success = false;

		if (record.getRegion().equalsIgnoreCase("Europe & Central Asia")
				|| record.getRegion().equalsIgnoreCase("Latin America & Caribbean")
				|| record.getRegion().equalsIgnoreCase("North America")) {
			// EUROPE AND AMERICA

			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_AR);
			
			if(success) {
				connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				return false;
			}
			
			if(success) {
				connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_AR);
			} else {
				//rollback
				return false;
			}
			
			if(success) {
				connection.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
				success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_EA);
			} else {
				//rollback
				return false;
			}
			

		} else if (record.getRegion().equalsIgnoreCase("East Asia & Pacific")
				|| record.getRegion().equalsIgnoreCase("Middle East & North Africa")
				|| record.getRegion().equalsIgnoreCase("South Asia")
				|| record.getRegion().equalsIgnoreCase("Sub-Saharan Africa")) {
			// ASIA AND AFRICA

			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_AA);
			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
			success = dbHelper.addRecord(connection.getConnection(), record, Record.TABLE_AA);

		}

		return success;
	}

	public boolean updateRecord(Record record) {
		connection = DBConnection.getInstance();
		boolean success = false;

		if (record.getRegion().equalsIgnoreCase("Europe & Central Asia")
				|| record.getRegion().equalsIgnoreCase("Latin America & Caribbean")
				|| record.getRegion().equalsIgnoreCase("North America")) {
			// EUROPE AND AMERICA

			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_EA);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_EA);

		} else if (record.getRegion().equalsIgnoreCase("East Asia & Pacific")
				|| record.getRegion().equalsIgnoreCase("Middle East & North Africa")
				|| record.getRegion().equalsIgnoreCase("South Asia")
				|| record.getRegion().equalsIgnoreCase("Sub-Saharan Africa")) {
			// ASIA AND AFRICA

			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_AA);
			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
			success = dbHelper.updateRecord(connection.getConnection(), record, Record.TABLE_AA);

		}

		return success;
	}

	public boolean deleteRecord(Record record) {
		connection = DBConnection.getInstance();
		boolean success = false;

		if (record.getRegion().equalsIgnoreCase("Europe & Central Asia")
				|| record.getRegion().equalsIgnoreCase("Latin America & Caribbean")
				|| record.getRegion().equalsIgnoreCase("North America")) {
			// EUROPE AND AMERICA

			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_EA);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_EA);

		} else if (record.getRegion().equalsIgnoreCase("East Asia & Pacific")
				|| record.getRegion().equalsIgnoreCase("Middle East & North Africa")
				|| record.getRegion().equalsIgnoreCase("South Asia")
				|| record.getRegion().equalsIgnoreCase("Sub-Saharan Africa")) {
			// ASIA AND AFRICA

			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_AA);
			connection.setConnection(URL_AR_AA, DB_NAME_AR_AA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_EA_AR, DB_NAME_EA_AR, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_AR);
			connection.setConnection(URL_AA_EA, DB_NAME_AA_EA, USERNAME, PASSWORD);
			success = dbHelper.deleteRecord(connection.getConnection(), record, Record.TABLE_AA);

		}

		return success;
	}
}
