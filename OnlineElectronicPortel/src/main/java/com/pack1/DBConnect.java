package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{
	static Connection con;
	static 
	{
		try 
		{
			Class.forName(DBinfo.driver);
			con = DriverManager.getConnection(DBinfo.url, DBinfo.user, DBinfo.pwd);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		return con;
	}

	
}
