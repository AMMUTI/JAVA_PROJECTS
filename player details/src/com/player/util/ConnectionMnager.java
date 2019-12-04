package com.player.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionMnager {
	static Connection conn=null;
	public static Properties loadpropertiesFile()throws Exception {
		Properties prop =new Properties();
		InputStream in =new FileInputStream("C:\\Users\\USER\\.eclipse\\org.eclipse.tips.state\\org.eclipse.tips.ide.state\\player details\\src\\Resources\\jdpc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
	public Connection getConnection() throws Exception {
		Properties prop = loadpropertiesFile();
		final String driver =prop.getProperty("driver");
		final String url =prop.getProperty("url");
		final String username =prop.getProperty("username");
		final String password=prop.getProperty("password");
		try {
		Class.forName(driver);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		conn =DriverManager.getConnection(url,username,password);}
		catch(SQLException e) {
			System.out.println("Connection Failed check output");
			e.printStackTrace();
			throw e;
			
		}
		
		return conn;
		
	}
}
