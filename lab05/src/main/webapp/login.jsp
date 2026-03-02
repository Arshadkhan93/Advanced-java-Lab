<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<title>Login Page</title>
</head>
<body>
<form action="login" method="post">
<center>
<h1>
<%
String msg = request.getParameter("msg");
if("success".equals(msg))
{
%>
<p style="color:green;">Registration Successful! Please Login.</p>
<%
}
%>
Admin Name : <input type="text" name="name"><br><br>
Admin Pass : <input type="text" name="pass"><br><br>
<input type="submit" value="Login" name="Login">
</h1>
</center>
</form>
</body>
</html>