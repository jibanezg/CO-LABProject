<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a new Client</title>
</head>
<body>
	<form action="../client/${client.id}" method="post">
		<div>
			Name:<br> <input type="text" name="name" value="${client.name}" />
		</div>
		<div>
			Address: <br>
			<label>Street:</label><input type="text" name="street" value="${client.address.street}" /> <br> 
			<label>City:</label><input type="text" name="city" value="${client.address.city}" /> 
			<label>State:</label><input type="text" name="state" value="${client.address.state}" /> 
			<label>ZipCode:</label><input type="text" name="zipcode" value="${client.address.zipCode}" /> <br>
		</div>
		<div>
			Active Rentals:
			<ul>
				<c:forEach var="rental" items="${client.rentals}">
					<li><label>Rental Id:</label><input type="text" name="rentalid" value="${rental.id}" />
					<label>Rental Description:</label>
					<input type="text" name="rentaldescr value="${rental.description}" />
					</li>
				</c:forEach>
			</ul>
		</div>
		<div>
			Billing info:<br>
			<label>Billing:</label><input type="text" name="billing" value="${client.price}" />
		</div>
		<input type="submit" value="update"/>
	</form>
	<form action="delete?clientId=${client.id}" method="post">
		<button type="submit">Delete</button>
	</form>
</body>
</html>