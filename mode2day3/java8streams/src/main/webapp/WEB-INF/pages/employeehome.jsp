<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
	<h1>Employee List</h1>
	<form action = "searchemployee" method = "post">
	<h4>Enter Employee Name</h4>
	Name :
	<input type = "text" name="empname"/><br/><br/>
	Band:
	<input type = "text" name = "band" /><br/><br/>
	Salary Greater Than:
	<input type = "number" name = "salary" /> 
	<input type = "submit" value = "Search"/>
	</form>
	<h2>No of Employees ${employeeList.size()}</h2>
	<table border= "3">
		<tr>
			<th>Employee Name</th>
			<th>Salary</th>
			<th>Band</th>
			<th>Date of Join</th>
		</tr>
	
	<c:forEach var = "lst" items = "${employeeList}">
		<tr>
			<td>${lst.empname}</td>
			<td>${lst.salary}</td>
			<td>${lst.band}</td>
			<td>${lst.dateofjoin}</td>
		</tr>
	</c:forEach>
	
	</table>
	</div>
</body>
</html>