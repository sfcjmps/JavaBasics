<%@page import="com.hcl.ems.EmployeeBaL"%>
<%@page import="com.hcl.ems.LeaveHistory"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function cancel() {
		document.getElementById("startdate").value = "";
		document.getElementById("enddate").value = "";
		document.getElementById("days").value = "";
		document.getElementById("leavereason").value = "";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	<center>
		<table>
			<tr>
				<td>Start Date :</td>
				<td><input type = "date" name = "startdate" id = "startdate"/></td> 
			</tr>
			<tr>
				<td>End Date :</td>
				<td><input type = "date" name = "enddate" id = "enddate"/></td>
			</tr>
			<tr>
				<td>Number Of Days :</td>
				<td><input type = "number" readonly = "readonly" name = "days" id = "days"/></td>
			</tr>
			<tr>
				<td>Leave Type :</td>
				<td><select name = "leavetype">
					<option value = "earned leave" >Earned Leave</option>
					<option value = "restricted" >Restricted Leave</option>
				</select></td>
				
			</tr>
			<tr>
				<td>Leave Reason :</td>
				<td><input type = "text" name = "leavereason" id = "leavereason"/></td>
			</tr>
			<tr>
				<td><input type = "submit" value = "Apply" /></td>
				<td><input type = "button" value = "Cancel" onclick = "cancel()"/></td>
			</tr>	
		</table>
	</center>
</form>

<%
    LeaveHistory obj = new LeaveHistory();
	obj.setLea_start_date("startdate");
	obj.setLea_end_date("enddate");
	obj.setLea_type("leavetype");
	obj.setLea_reason("leavereason");
	obj.setEmp_id(emp_id)
	List<LeaveHistory> obj = EmployeeBaL.
%>
</body>
</html>