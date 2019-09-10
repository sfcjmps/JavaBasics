<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.html" />
<form method = "get" action = "AddAccount.jsp">
		<center>
			First Name :
			<input type = "text" name = "firstName" /><br/><br/>
			Last Name :
			<input type = "text" name = "lastName" /><br/><br/>
			City :
			<input type = "text" name = "city" /><br/><br/>
			State :
			<input type = "text" name = "state" /><br/><br/>
			Amount :
			<input type = "text" name = "amount" /><br/><br/>
			Cheque Facility :
			<input type = "radio" name = "cheqFacil" value = "yes"/>YES<br/><br/>
			<input type = "radio" name = "cheqFacil" value = "no" />NO<br/><br/>
			Account Type :
			<input type = "radio" name = "accountType" value = "Savings" />Savings<br/><br/>
			<input type = "radio" name = "accountType" value = "Current" />Current<br/><br/>
			<input type = "submit" value = "ADD" />;
		</center>
	</form>
</body>
</html>