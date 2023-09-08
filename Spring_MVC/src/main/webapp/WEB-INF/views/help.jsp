<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Pages</title>
</head>
<body>

   <%
    String name=(String)request.getAttribute("name");  
    Integer rollno=(Integer)request.getAttribute("rollno");
  %>
  
  <h1>This is Help Page</h1>
  <h1>Hello my name is<%=name %></h1>
   <h1>Hello my Rollnumber is<%=rollno %></h1> 
</body>
</html>