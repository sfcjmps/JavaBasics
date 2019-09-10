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
	url = "jdbc:mysql://localhost:3306/bank"
	user = "root"
	password = "root"
	/>
	<c:set var = "flag" value = "0" />
	<sql:update var = "d" dataSource = "${conn}">
		update accounts set amount = amount - ? where accountno = ?
		<sql:param value = "${param.withdrawamt}" />
		<sql:param value = "${param.accno}" />
	</sql:update>
	<sql:update var = "s" dataSource = "${conn}">
		insert into trans(accountno,transamount,transtype) values(?,?,?)
		<sql:param value = "${param.accno}"></sql:param>
		<sql:param value = "${param.withdrawamt}"></sql:param>
		<sql:param value = "${'D'}"></sql:param>
		<c:set var = "flag" value = "1" />
			<c:out value = "Amount Debited Successfully..." />
	</sql:update>
	
	<c:if test="${flag == 0}">
		<c:out value = "Account Not Found..." />
	</c:if>

</body>
</html>