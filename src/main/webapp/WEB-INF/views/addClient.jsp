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
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" value="${client.name}" /> </td>
		</tr>
		<tr>
			<td>Address:</td>
			<td><input type="text" name="address" value="${client.address}" /> </td>
		</tr>
		<tr>
			<td>Active Rentals:</td>
			<table>
				<c:forEach var="rental" items="${client.rentals}">
					<tr>
						<td>
						<input type="text" name="rental" value="${rental.id}" /> </td>
					</tr>
				</c:forEach>
			</table>
		<tr>
			<td>Billing info:</td>
			<td><input type="text" name="billing" value="${client.price}" /> </td>
		</tr>
	</table>
	<input type="submit" value="add"/>
	</form>
</body>
</html>