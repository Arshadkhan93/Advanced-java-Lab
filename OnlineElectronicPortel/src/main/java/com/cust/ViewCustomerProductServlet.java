package com.cust;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack1.ProductBean;
import com.pack1.ViewProductDAO;

public class ViewCustomerProductServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession session = req.getSession(false);
		if(session== null)
			throw new RuntimeException("Session  Exp[irwd");
		else
		{
			ArrayList<ProductBean> al = new  ViewProductDAO().retriveProduct();
			session.setAttribute("productList", al);
			req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
			
		}
	}

}
