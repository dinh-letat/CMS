package cms.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			// register MySQL Driver with DriverManager
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/cms";
			String username = "root";
			String password = "123456";
			
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection connection) {
		if(connection != null) {
			try {
				System.out.println(connection.getMetaData().toString());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
//	// init and return a connection to MySQL database
//	public static Connection getConnection() throws SQLException{
//		// mo ket noi toi csdl: MySQL
//		String url = "jdbc:mysql://localhost:3306/cms";
//		String username = "root";
//		String password = "123456";
//		
//		Connection connection = DriverManager.getConnection(url, username, password);
//		return connection;
//	}
//	
//	// function to test connection
//	public static void main(String [] args) {
//		
//	}
}
