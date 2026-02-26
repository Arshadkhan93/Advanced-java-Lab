package com.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session = req.getSession(false);
		if(session== null)
			throw new RuntimeException("Session  Expired");
		else
		{
			String pcode= req.getParameter("pcode");
			String pprice= req.getParameter("pprice");
			String pqty= req.getParameter("pqty");
			
			ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("productList");
			Iterator<ProductBean> i = al.iterator();
			ProductBean pb =null;
			while(i.hasNext())
			{
				pb=i.next();
				if(pcode.equals(pb.getpCode()))
					break;
				
			}
			pb.setpPrice(pprice);
			pb.setpQty(pqty);
			
			int rowCount = new UpdateProductDAO().updateProduct(pb);
			if(rowCount>0)
			{
				req.setAttribute("msg", "Product inventry updated Successfully");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, resp);
			}
			else
			{
				req.setAttribute("msg", "Product inventry Updated Failed!!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, resp);
			}
		}
	}

}
