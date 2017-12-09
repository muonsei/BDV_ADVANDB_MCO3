package model;

/**
 * Record class is the row class for one table
 * @author Jolene Valenzuela
 */

public class Record {
	public Record() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	private int id;
	private String region;
	private String country;
	private String year;
	private double value;
	
	
	public static final String TABLE_AR = "ar";
	public static final String TABLE_EA = "ea";
	public static final String TABLE_AA = "aa";
	public static final String COL_ID = "id";
	public static final String COL_REGION = "Region";
	public static final String COL_COUNTRY = "CountryName";
	public static final String COL_YEAR = "YearC";
	public static final String COL_DATA = "MortalityRateOfFemale";
}
