<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Orders Tracker</title>
</head>
<body>
	<table>
		<tr>
			<th>Customer</th>
			<th>Price</th>
			<th>Date of Order</th>
		</tr>
		
	<c:forEach var="order" items="${orders}">
		<tr>
			<td>${order.customer}</td>
			<td>${order.price}</td>
			<td>${order.dateOfOrder}</td>	
		</tr>
	</c:forEach>
	</table>
</body>
</html>