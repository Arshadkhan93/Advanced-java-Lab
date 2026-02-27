package lab5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lab5.model.AdminBean;
import lab5.servlet.DBConnection;

public class LoginDao 
{
	public static AdminBean login(String name,String pass)
	{
		AdminBean ab = null;
		try
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM ADMIN WHERE NAME=? AND PASS=?");
			
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				ab= new AdminBean();
				ab.setName(rs.getString(1));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return ab;
	}

}
