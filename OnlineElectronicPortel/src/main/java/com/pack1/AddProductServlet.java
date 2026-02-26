package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession session = req.getSession(false);
		if(session == null)
			throw new RuntimeException("Session Expired!!!");
		else
		{
		ProductBean pb = new ProductBean();
		pb.setpCode(req.getParameter("pcode"));
		pb.setpName(req.getParameter("pname"));
		pb.setpCom(req.getParameter("pcom"));
		pb.setpPrice(req.getParameter("pprice"));
		pb.setpQty(req.getParameter("pqty"));
		
		int rowCount = new AddProductDAO().addProduct(pb);
		
		if(rowCount>0)
		{
			req.setAttribute("msg", "Product Inserted Seccessfully");
			req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			
		}
		else
			throw new RuntimeException("Product Insertion failed");		
		}
	}
	

}
