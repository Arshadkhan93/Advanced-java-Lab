package lab5.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	static String driver="oracle.jdbc.driver.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	static String user="mydb";
	static String pwd="MYDB";
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			return con;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}

}
