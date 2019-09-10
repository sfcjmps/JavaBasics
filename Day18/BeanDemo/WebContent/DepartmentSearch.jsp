<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class = "com.hcl.beans.DepartmentSearch"></jsp:useBean>
	<jsp:setProperty property="deptno" name="bean1"/>
	<%
		ResultSet rs = bean1.searchDepartment();
		if (rs.next()) {
			out.println("Department No : " + rs.getInt("deptno") + "<br/>");
			out.println("Departmnet Name : " + rs.getString("dname") + "<br/>");
			out.println("Location : " + rs.getString("loc") + "<br/>");
			out.println("Head is : " + rs.getString("head") + "<br/>");
		} else {
			out.println("***Record Not Found***");
		}
	%>
</body>
</html>