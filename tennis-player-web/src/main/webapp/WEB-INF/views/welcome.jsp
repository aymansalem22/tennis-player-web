<%@page import="java.time.LocalDate" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Player DB</title>
</head>
<body>
<h2>Welcome to the tennis player database!</h2>
<h3>Player name: <i>${name}</i></h3>
<%
System.out.println("Hello from JSP"); 
%>
<%
LocalDate currentDate=LocalDate.now();
%>
<p>  Current Date: <%= currentDate %> </p>
<p>Today is <%= currentDate.getDayOfWeek() %></p>

<form  method="POST">
<b>Player name:<input type="text" name="name"/></b>
<input type="submit" value="Enter"/>
</form>

</body>
</html>












































