<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Head-to-Head-Ball</title>
<style>
.error {
color:red;
position: fixed;
}
</style>
</head>
<body>
<h2>Head-to-Head Statistics</h2>
<hr>
<form:form action="processStatsForms" modelAttribute="ballStats">
<br><br>
Player 3: <form:input path ="player3"/>&emsp; vs. &emsp;
Player 4: <form:input path ="player4"/>
<br><br>
Head-to-Head: <form:input path = "head3head" placeholder='##-##'/> &emsp;
<form:errors path="head3head" cssClass="error"/>
<br><br>

<input type="submit" value="Submit"/>
</form:form>
</body>
</html>










