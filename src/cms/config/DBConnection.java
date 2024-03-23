package cms.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// init and return a connection to MySQL database
	public static Connection getConnection() throws SQLException{
		// mo ket noi toi csdl: MySQL
		String url = "jdbc:mysql://localhost:3306/cms";
		String username = "root";
		String password = "123456";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
	// function to test connection
	public static void main(String [] args) {
		
	}
}
