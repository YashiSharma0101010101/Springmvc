<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
 <h1>This is home page</h1>
 <h1>Called by Home Page</h1>
 <h1>url /home</h1>
 <!-- how to get data in view -->
 <%  String name=(String)request.getAttribute("name");
     Integer id=(Integer)request.getAttribute("id");
 %>
 
 <!-- print the name -->
 <h1>Name is <%=name %></h1>
 <h1>id is<%=id %></h1>
</body>
</html>