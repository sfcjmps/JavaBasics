<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.html"></jsp:include>
	<form method = "get" action = "PlaceOrder.jsp">
		<center>
			Stock ID :
			<input type = "text" name = "stockId" /><br/><br/>
			Order Quantity :
			<input type = "text" name = "orderQuantity" /><br/><br/>
			<input type = "submit" value = "place Order" ?>
		</center>
	</form>
</body>
</html>