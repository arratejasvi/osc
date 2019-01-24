package com.osc.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	
	
	public  static Connection geConnection()

	{
		Connection conn=null;
		
		String drverURL ="jdbc:sqlserver://127.0.0.1:1433;databseName=osc";
		String dbusername ="sa";
		String dbpassword ="1991";
		try
		{

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(drverURL, dbusername, dbpassword);
			
		}
		catch (Exception e) {
e.printStackTrace();}
		
		return conn;
		
	}
}
