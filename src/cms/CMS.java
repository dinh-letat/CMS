package cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import cms.config.DBConnection;
import cms.view.CMSGui;
import cms.view.Login;
import cms.view.LoginGUI;


// class main for project
public class CMS {
	public static void main(String[] args) {
		// create connect to database across DBConnection
		Connection connection = DBConnection.getConnection();	
		DBConnection.printInfo(connection);
		DBConnection.closeConnection(connection);
		System.out.println(connection);
		
		// run application from CMSGui interface
//		CMSGui cmsGUI = new CMSGui();
//		cmsGUI.initGUI();
		
		LoginGUI loginGUI = new LoginGUI();
	}
}