<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clients currently renting offices</title>
</head>
<body>
	<h1>Clients currently renting offices</h1>
	<table>
		<c:forEach var="client" items="${clients}">
			<tr>
				<th>Name</th>
				<th>Offices</th>
			</tr>
			<tr>
				<td>${client.name}</td>
				<td><c:forEach var="rental" items="${client.rentals}">
						<input type="text" name="rentalid" value="${rental.id}" />,<sp>
					</c:forEach></td>
				<td><a href="client/${client.id}">edit</a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="addCLient"> Add a client</a>
</body>
</html>