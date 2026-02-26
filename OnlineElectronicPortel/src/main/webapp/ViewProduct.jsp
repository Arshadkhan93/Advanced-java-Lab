<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ViewProduct.jsp</title>
</head>
<body>
<center>
  <h1>
    <%
      AdminBean abean = (AdminBean) session.getAttribute("abean");
      ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("productList");
        
      if(al.size()==0)
    	  out.println("Product are not Available in the inventry");
      else
      {
    	  out.println("Hellow mr."+abean.getA_fname()+" These are your Product Details <br><br>");
    	  
    	  Iterator<ProductBean> i = al.iterator();
    	  while(i.hasNext())
    	  {
    		  ProductBean pb = i.next();
    		  out.print(pb.getpCode()+" : "+pb.getpName()+" : "+pb.getpCom()+" : "+pb.getpPrice()+" : "+pb.getpQty()+"");
    		  out.print("<a href='edit?pcode="+pb.getpCode()+"'>Edit</a>");
    		  out.print("<a href='delete?pcode="+pb.getpCode()+"'>Delete</a>"+"<br><br>");
    	  }
      }
    %>
  </h1>
</center>
</body>
</html>