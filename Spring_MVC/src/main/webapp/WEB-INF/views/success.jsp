<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${Header}</h1>
<p>${Desc }</p>



 <%--  <h1>Welcome ${name}</h1> --%>
       <h1>Welcome ${user.username}</h1>
  <%-- <h1>Your email address is ${email}</h1> --%>
      <h1>Your email address is ${user.useremail}</h1> 
  <%-- <h1>Your PassWord is ${password} try to secure the password</h1> --%>
       <h1>Your PassWord is ${user.userpass} try to secure the password</h1>
</body>
</html>