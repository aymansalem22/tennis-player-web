<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Player Confirmation</title>
</head>
<body>
<h2>Player Confirmation</h2>
<br><br>
The Player has been added.
<br><br>
<b>Name</b> : ${athlete.firstName}
 ${athlete.lastName}
<br><br>
<b>Current Rank</b> : ${athlete.rank}
<br><br>
Country : ${athlete.country}
<br><br>
Handedness : ${athlete.handedness}
<br><br>
Grand Slam Titles :
<ul>
<c:forEach items="${athlete.grandSlams}" var="title">
<li>${title}</li>
</c:forEach>
</ul>
<br><br>
<b>Last Won</b> : <fmt:formatDate value="${athlete.lastWon}" type="date" pattern="dd-MM-YYYY"/>
<br><br>
<b>Prize Money</b> : ${athlete.prizeMoney}
</body>
</html>










