package com.forma.gp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnexionUtil {

	private static ConnexionUtil instance;
	private String url = "jdbc:mysql://localhost:3306/bank_db";
	private String username = "root";
	private String password = "";
	private Connection connection;

	private ConnexionUtil() throws ClassNotFoundException, SQLException {

		// Install driver
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);

	}

	public static ConnexionUtil getInstance() throws ClassNotFoundException, SQLException {
		/*
		 * The null check ensures that instance is assigned just once with an instance
		 * of MyClass the null check will return true only the first time GetInstance is
		 * called
		 */
		if (instance == null) {
			instance = new ConnexionUtil();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

	public static void main(String[] args) {
		try {
			getInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
