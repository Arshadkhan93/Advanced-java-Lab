package com.cust;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clog")
public class CustomerLoginServlet  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name = req.getParameter("cname");
		String pwd = req.getParameter("pwd");
		
		CustomerBean cb = CustomerLoginDAO.loginCustomer(name, pwd);
		
		if(cb!=null)
		{
			req.setAttribute("cbean", cb);
			req.getRequestDispatcher("CustomerHome.jsp").forward(req, resp);
		}
		else
			System.out.println("CB is Null");
	}

}
