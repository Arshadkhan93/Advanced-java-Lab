package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{
	public int addProduct(ProductBean pb)
	{
		int rowCont=0;
		try 
		{
			Connection con = DBConnect.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?,?)");
			ps.setString(1, pb.getpCode());
			ps.setString(2, pb.getpName());
			ps.setString(3, pb.getpCom());
			ps.setString(4, pb.getpPrice());
			ps.setString(5, pb.getpQty());
			
			rowCont = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
		return rowCont;
	}

}
