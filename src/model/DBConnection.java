package model;

import java.sql.*;

/**
 * DBConnection Singleton class
 */
public class DBConnection {

	/**
	 * One global DBConnection object per application instance.
	 */
	private static final DBConnection dbc = new DBConnection();

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;

	public static DBConnection getInstance() {
		return dbc;
	}

	public void setConnection(String url, String db, String user, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url + "/" + db + "?useSSL=false", user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}

	public void closeConnection() {
		if (connection == null) {
			return;
		}
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setNull(int p) throws SQLException {
		preparedStatement.setNull(p, Types.INTEGER);
	}

	public void setInt(int p, int x) throws SQLException {
		preparedStatement.setInt(p, x);
	}

	public void setString(int p, String x) throws SQLException {
		preparedStatement.setString(p, x);
	}

	public void setDouble(int p, double x) throws SQLException {
		preparedStatement.setDouble(p, x);
	}

	public void prepareStatement(String query) throws SQLException {
		preparedStatement = connection.prepareStatement(query);
	}

	public void closePreparedStatement() throws SQLException {
		preparedStatement.close();
	}

	public int executeUpdate() throws SQLException {
		return preparedStatement.executeUpdate();
	}

	public int executeUpdate(String query) throws SQLException {
		statement = connection.createStatement();
		return statement.executeUpdate(query);
	}

	public ResultSet executeQuery(String query) throws SQLException {
		statement = connection.createStatement();
		return statement.executeQuery(query);
	}
}
