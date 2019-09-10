<%@page import="com.hcl.hib.FeedBackOperations"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.hib.Count"%>
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
			Count obj = new Count();
			obj.setInstructor((String)session.getAttribute("inst"));
			obj.setSubject(request.getParameter("subjects"));
			List<Count> c = FeedBackOperations.count(obj);
	%>
			<table border = "3">
			<tr>
					<th>FeedBack Value</th>
					<th>Count</th>
			</tr>
	<%
			for(Count ct : c) {
	%>
					<tr>
					<td><input type = "text" name = "fbval" value = <%=ct.getFbval() %> /></td>
					<td><input type = "text" name = "count" value = <%=ct.getCount() %> /></td>
					</tr>
	<%
			}
	%>
			</table>
</body>
</html>