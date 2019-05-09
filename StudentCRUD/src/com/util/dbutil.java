package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbutil {
	private static final String URL = "jdbc:postgresql://localhost:5432/testdb";
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";

	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static Connection connection;
	public static Connection getConnection() {

		try {
			
			if (connection == null|| connection.isClosed()) {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
