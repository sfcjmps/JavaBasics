<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var = "conn"
	driver = "com.mysql.jdbc.Driver"
	url = "jdbc:mysql://localhost:3306/sqlpractice"
	user = "root"
	password = "root"
	/>
	<sql:update var = "deptUpdate" dataSource = "${conn}">
		insert into department values(?,?,?,?)
		<sql:param value = "${param.deptno}"></sql:param>
		<sql:param value = "${param.dname}"></sql:param>
		<sql:param value = "${param.loc}"></sql:param>
		<sql:param value = "${param.head}"></sql:param>
	</sql:update>
	<c:out value = "Record Inserted..." />
</body>
</html>