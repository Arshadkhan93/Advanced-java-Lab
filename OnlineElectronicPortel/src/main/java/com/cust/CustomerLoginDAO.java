package com.cust;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pack1.DBConnect;

public class CustomerLoginDAO
{
	public static CustomerBean loginCustomer(String name,String pwd)
	{
		CustomerBean cb = new CustomerBean();
		try 
		{
			Connection con = DBConnect.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from customer where uname=? and pword=?");
			ps.setString(1, name);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cb.setCname(rs.getString(1));
				cb.setPassword(rs.getString(2));
				cb.setFname(rs.getString(3));
				cb.setLname(rs.getString(4));
				cb.setAddress(rs.getString(5));
				cb.setMailId(rs.getString(6));
				cb.setMoNo(rs.getString(7));
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Inside Customer Login DAO");
		}
		
		return cb;
		
	}

}
