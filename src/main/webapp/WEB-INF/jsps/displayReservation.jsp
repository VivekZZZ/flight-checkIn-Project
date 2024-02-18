<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation details</title>
</head>
<body>
	<h2>Reservation Details</h2>
	Passenger Name : ${reservation.getPassenger().getFirstName()}
	<br> Passenger Email : ${reservation.getPassenger().getEmail()}
	<br> Passenger Phone : ${reservation.getPassenger().getPhone()}
	<br> Operating Airlines :
	${reservation.getFlight().getOperatingAirlines()}
	<br> Flight Name : ${reservation.getFlight().getFlightName()}
	<br> Departure City :
	${reservation.getFlight().getDepartureCity()}
	<br> Arrival City : ${reservation.getFlight().getArrivalCity()}
	<br> Date of Departure :
	${reservation.getFlight().getDateOfDeparture()}

	<h2>Update number of Bags and Checked in Status</h2>
	<form action="proceedToCheckedIn" method="post">
		<pre>
		Reservation Id <input type="text" name="id"
				value="${reservation.getId()}">
	Number of Bags <input type="text" name="numberOfBags">
	<input type="submit" value="confirm">
	</pre>
	</form>
</body>
</html>