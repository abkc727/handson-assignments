package com.hsbc.model.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.ClientDriver;

public class DBUtility {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(ClientDriver.class.getName());
		
		Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb;user=aditya;password=abkc123");
		return connection;
	}

}
