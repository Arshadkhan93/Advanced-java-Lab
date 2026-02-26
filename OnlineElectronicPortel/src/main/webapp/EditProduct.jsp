<%@page import="com.pack1.ProductBean"%>
<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EditProduct</title>
</head>
<body>
<center>
  <h1>
      <%
      AdminBean abean = (AdminBean) session.getAttribute("abean");
      ProductBean pb = (ProductBean) request.getAttribute("p_bean");
      out.println(abean.getA_fname()+" below is the data is alvailabe to edit <br><br>");
      
      %>
      <form action="update" method="post">
      Product Price <input type="text" name=pprice value="<%= pb.getpPrice() %>"><br><br>
      Product Quntity <input type="text" name=pqty value="<%= pb.getpQty() %>"><br><br>
      <input type="hidden" name=pcode value="<%= pb.getpCode() %>">
      <input type="submit" value="update">       
      
      </form>
    </h1>
</center>
</body>
</html>