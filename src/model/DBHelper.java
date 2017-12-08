package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

public class DBHelper {

	private final String DB_NAME = "advandb_mco3";
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";

	private DBConnection connection;

	public DBHelper() {
		connection.setConnection(DB_NAME, USERNAME, PASSWORD);
		this.connection = DBConnection.getInstance();
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
						" VALUES (?, ?, ?, ?, ?)";
		
		try {
			connection.prepareStatement(query);
			
			connection.setNull(1);
			connection.setString(2, record.getRegion());
			connection.setString(3, record.getCountry());
			connection.setString(4, record.getYear());
			connection.setDouble(5, record.getValue());
			
			connection.executeUpdate();
			connection.closePreparedStatement();
			
			System.out.println("[RECORD] INSERT SUCCESS!");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			System.out.println("[RECORD] INSERT FAILED!");
		}	
		return false;
	}
	
	// TODO Update
	public void updateRecord(Record record) {
		try {
			String query = 	"UPDATE " + Record.TABLE +
							" SET " + Record.COL_REGION + " = ?, " +
							Record.COL_COUNTRY + " = ?, " + 
							Record.COL_YEAR + " = ?, " +
							Record.COL_DATA + " = ? " +
							" WHERE " + Record.COL_ID + " = ?";
			
			connection.prepareStatement(query);
			
			connection.setString(1, record.getRegion());
			connection.setString(2, record.getCountry());
			connection.setString(3, record.getYear());
			connection.setDouble(4, record.getValue());
			connection.setInt(5, record.getId());
			
			connection.executeUpdate();
			connection.closePreparedStatement();
			
			System.out.println("[RECORD] UPDATE SUCCESS! ");
		} catch (SQLException ev) {
			ev.printStackTrace();
			System.out.println("[RECORD] UPDATE FAILED! ");
		}
	}
	
	// TODO Delete
	public void deleteRecord(int id) {
		String query = 	"DELETE FROM " + 
						Record.TABLE +
						" WHERE " + Record.COL_ID + " = ?";
		
		try {
			connection.prepareStatement(query);
			
			connection.setInt(1, id);
			
			connection.executeUpdate();
			connection.closePreparedStatement();
			
			System.out.println("[RECORD] DELETE SUCCESS!");
		} catch (SQLException ev) {
			System.out.println("[RECORD] DELETE FAILED!");
			ev.printStackTrace();
		}	
	}
}
