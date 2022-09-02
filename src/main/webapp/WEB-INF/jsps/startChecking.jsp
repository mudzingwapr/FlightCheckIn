<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start Check In</title>
</head>
<body>
<div align="center">
<h2>Check in Here</h2>
<form action="startChecking" method="post">
Enter the reservation id: <input type="text" name ="reservationId" placeholder="Reservation id" required="required"/>
<input type="submit"value="Start_CheckIn"/>
</form>
</div>
</body>
</html>