<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
<center>
<h1>
<%
String msg = request.getParameter("msg");
if("failed".equals(msg)){
%>
<p style="color:red;">Registration Failed! Try Again.</p>
<%
}%>
Admin Name : <input type="text" name="name"><br><br>
Admin Pass : <input type="text" name="pass"><br><br>
First Name : <input type="text" name="fname"><br><br>
Last Name : <input type="text" name="lname"><br><br>
Email Id : <input type="text" name="mailId"><br><br>
Phone : <input type="text" name="phno"><br><br>
<input type="submit" value="Register"> 
</h1>
</center>
</form>

</body>
</html>