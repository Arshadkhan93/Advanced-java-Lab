package com.cust;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/creg")
public class CustomerRegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		CustomerBean cb = new CustomerBean();
		cb.setCname(req.getParameter("name"));
		cb.setPassword(req.getParameter("pwd"));
		cb.setFname(req.getParameter("fname"));
		cb.setLname(req.getParameter("lname"));
		cb.setAddress(req.getParameter("addr"));
		cb.setMailId(req.getParameter("mail"));
		cb.setMoNo(req.getParameter("mono"));
		
		int rowCount = CustomerRegisterDAO.custRegister(cb);
		if(rowCount>0)
		{
			req.getRequestDispatcher("CustomerLogin.html").forward(req, resp);
		}
		else
			System.out.println("Data Not Inserted!! or Else Register Failed");
	}

}
