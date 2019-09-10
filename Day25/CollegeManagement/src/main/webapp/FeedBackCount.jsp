<%@page import="com.hcl.hib.Count"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.hib.FeedBackOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function submit() {
		document.instmethod.submit();
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method = "get" action = "FeedBackCount.jsp">
		<center>
			Instructor :
			<select name = "instructor" onchange = "submit()">
				<option>Select One Option</option>
				<%
					List<String> lst = FeedBackOperations.instructors();
					for(String obj : lst) {
				%>
				<option value = <%=obj %> ><%=obj %></option>
				<%
					}
				%>
			</select><br/><br/>
				<%
					String inst = request.getParameter("instructor");
					session.setAttribute("inst", inst);
				%>
		</center>
	</form>
	<form method = "get" action = "FeedBackCount1.jsp">
		<center>
			Select Subject :
			<select name = "subjects" >
			<option>Select One Option</option>
				<%
					List<String> obj1 = FeedBackOperations.subjects(request.getParameter("instructor"));
					for(String obj2 : obj1) {
				%>
				<option value = <%=obj2 %> ><%=obj2 %></option>
				<%
					}
				%>
			</select><br/><br/>
			<input type = "submit" value = "Show" />
		</center>
	</form>
</body>
</html>