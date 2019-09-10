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
	<sql:query var="search" dataSource = "${conn}">
		select * from accounts where accountno = ?
		<sql:param value = "${param.accno}"></sql:param>
	</sql:query>
	<c:set var = "flag" value = "0" />
	<c:forEach var = "a" items = "${search.rows}">
		Account No :
		<c:out value = "${a.accountno}" /><br/>
		First Name :
		<c:out value = "${a.firstname}" /><br/>
		Last Name :
		<c:out value = "${a.lastname}" /><br/>
		City :
		<c:out value = "${a.city}" /><br/>
		State :
		<c:out value = "${a.state}" /><br/>
		Amount :
		<c:out value = "${a.amount}" /><br/>
		CheqFacil :
		<c:out value = "${a.cheqfacil}" /><br/>
		Account Type :
		<c:out value = "${a.accounttype}" /><br/>
		Status :
		<c:out value = "${a.status}" />
		<c:set var = "flag" value = "1" />
	</c:forEach>
	<c:if test="${flag == 0}">
		<c:out value = "Account not Found..." />
	</c:if>
	
</body>
</html>