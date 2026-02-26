package lab5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lab5.model.AdminBean;
import lab5.servlet.DBConnection;

public class AdminDao
{
	
	public int regiter(AdminBean ab)
	{
		int rowCount=0;
		try 
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into ADMIN VALUES(?,?,?,?,?,?)");
			ps.setString(1, ab.getName());
			ps.setString(2, ab.getPass());
			ps.setString(3, ab.getfName());
			ps.setString(4, ab.getlName());
			ps.setString(5, ab.getMailId());
			ps.setLong(6, ab.getPhno());
			
			rowCount = ps.executeUpdate();
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
		return rowCount;
	}

}
