package main.java.com.clinica.odontologica.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String JDBC_URL = "jdbc:h2:~/clinica";
	private static final String USER = "sa";
	private static final String PASSWORD = "";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL,USER,PASSWORD);

	}



}