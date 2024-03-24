package cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import cms.config.DBConnection;
import cms.view.CMSGui;

public class CMS {
	public static void main(String[] args) {
		Connection connection = DBConnection.getConnection();	
		System.out.println(connection);
	}
}


//public static Connection getConnection() throws SQLException, ClassNotFoundException {
//Class.forName("com.mysql.cj.jdbc.Driver");
//String url = "jdbc:mysql://localhost:3306/cms?useSSL=false&serverTimezone=UTC"; 
//String username = "root"; 
//String password = "123456"; 
//
//return DriverManager.getConnection(url, username, password);
//}
//public static void main(String [] args) {
////// Chạy ứng dụng từ giao diện CMSGui
////CMSGui gui = new CMSGui();
////gui.initGUI();
//
//try {
//    Connection connection = getConnection();
//    if (connection != null) {
//        System.out.println("Kết nối thành công tới cơ sở dữ liệu!");
//        connection.close();
//    } else {
//        System.out.println("Không thể kết nối tới cơ sở dữ liệu!");
//    }
//} catch (SQLException | ClassNotFoundException e) {
//    System.out.println("Lỗi khi kết nối tới cơ sở dữ liệu: " + e.getMessage());
//}
//}
