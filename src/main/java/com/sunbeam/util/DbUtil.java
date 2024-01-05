package com.sunbeam.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/voting";
	public static final String DB_USER = "vasani";
	public static final String DB_PASSWORD = "vasani";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static ServletContext ctx = null;

	public static Connection getConnection() throws Exception {
//		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		Connection con = (Connection) ctx.getAttribute("dbconn");

		return con;
	}
}
