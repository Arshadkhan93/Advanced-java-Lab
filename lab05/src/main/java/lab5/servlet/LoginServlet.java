package lab5.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lab5.dao.LoginDao;
import lab5.model.AdminBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		AdminBean ab = LoginDao.login(name, pass);
		
		if(ab!=null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("admin", ab);
			
			res.sendRedirect("loginsuccess.jsp");
		}
		else
			res.sendRedirect("login.jsp");
	}

}
