<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<div align="center">
<h2>Flight Details</h2>

Flight Number:               ${res.flight.flightno}<br/>
AirLine:                     ${res.flight.operatingAirline} <br/>
Departure City:              ${res.flight.departureCity}<br/>
Destination City:            ${res.flight.arrivalCity}<br/>
Date Of Departure and Time:  ${res.flight.dateofDeparture}<br/>
   <h2>Passenger Details</h2>
Name:                        ${res.passenger.firstName}<br/>
LastName:                    ${res.passenger.lastName}<br/>
Email:                       ${res.passenger.email}<br/>
Phone Number:                ${res.passenger.phoneNumber}<br/>

<form action="completeCheckIn" method="post">
Enter the Number of bags: <input type="text" name="numberOfBags" placeholder="number of bags"required="required"/>
<input type="hidden"value="${res.id}" name="reservationId"/>
<input type="submit" value="CheckIn"/>
</form>
</div>
</body>
</html>