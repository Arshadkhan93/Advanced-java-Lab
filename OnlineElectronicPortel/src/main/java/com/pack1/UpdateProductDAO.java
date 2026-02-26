package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO
{
	public int updateProduct(ProductBean pb)
	{
		int rowCount=0;
		try 
		{
			Connection con = DBConnect.getConnection();
			PreparedStatement ps = con.prepareStatement("update product set pprice=? , qty=? where pcode=?");
			ps.setString(1, pb.getpPrice());
			ps.setString(2, pb.getpQty());
			ps.setString(3, pb.getpCode());
			rowCount = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return rowCount;
	}

}
