package com.cust;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pack1.DBConnect;

public class CustomerRegisterDAO 
{
	public static int custRegister(CustomerBean cb)
	{
		int rowCount=0;
		try 
		{
			Connection con = DBConnect.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			ps.setString(1, cb.getCname());
			ps.setString(2, cb.getPassword());
			ps.setString(3, cb.getFname());
			ps.setString(4, cb.getLname());
			ps.setString(5, cb.getAddress());
			ps.setString(6, cb.getMailId());
			ps.setString(7, cb.getMoNo());
			rowCount = ps.executeUpdate();
		
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
		return rowCount;
	}

}
