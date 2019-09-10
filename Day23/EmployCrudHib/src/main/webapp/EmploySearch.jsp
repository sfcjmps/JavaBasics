<%@page import="com.hcl.hib.Employ"%>
<%@page import="com.hcl.hib.EmployCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		EmployCrud obj = new EmployCrud();
		Employ obj1 = obj.searchEmploy(Integer.parseInt(request.getParameter("empno")));
		if(obj1 != null) {
	%>
	Employ No : <%=obj1.getEmpno() %><br/>
	Employ Name : <%=obj1.getName() %><br/>
	Employ Department  : <%=obj1.getDept() %><br/>
	Employ Designation : <%=obj1.getDesig() %><br/>
	Employ Salary : <%=obj1.getBasic() %>
	<%
		} else {
	%>
	<%="Record Not Found..." %>
	<%
		}
	%>
</body>
</html>