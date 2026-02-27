package lab5.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab5.dao.AdminDao;
import lab5.model.AdminBean;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		 String name=req.getParameter("name");
		 String pass=req.getParameter("pass");
		 String fName=req.getParameter("fname");
		 String lName=req.getParameter("lname");
		 String mailId=req.getParameter("mailId");
		 long phno=Long.parseLong(req.getParameter("phno"));
		 
		 AdminBean ab = new AdminBean();
		 ab.setfName(fName);
		 ab.setlName(lName);
		 ab.setName(name);
		 ab.setPass(pass);
		 ab.setPhno(phno);
		 ab.setMailId(mailId);
		 
		 AdminDao adminDao = new AdminDao();
		 int k = adminDao.regiter(ab);
		 
		 if (k > 0)
			 res.sendRedirect("login.jsp?msg=success");
	     else
	         res.sendRedirect("admin_register.jsp?msg=failed");
		 
		
	}
	

}
