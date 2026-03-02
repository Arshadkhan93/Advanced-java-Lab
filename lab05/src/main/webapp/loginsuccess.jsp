<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Login Success . jsp</title>
</head>
<body>
<div class="container mt-5">
    <h2 class="text-success">Admin Dashboard</h2>
    <div class="list-group mt-4">
        <a href="addbook.jsp" class="list-group-item list-group-item-action">Add Book</a>
        <a href="viewbooks" class="list-group-item list-group-item-action">View Books</a>
        <a href="logout.jsp" class="list-group-item list-group-item-action text-danger">Logout</a>
    </div>
</div>

<%
if(session.getAttribute("admin")==null)
	response.sendRedirect("login.jsp");
%>

<center> <h2>Login Successful</h2>
<a href="addbook.jsp">ADD BOOK</a><br>
<a href="deletebook.jsp">DELETE BOOK</a><br>
<a href="updatebook.jsp">UPDATE BOOK</a><br>
<a href="viewbooks.jsp">VIEW BOOKS</a><br>
<a href="logout.jsp">LOGOUT</a>


</center>
</body>
</html>