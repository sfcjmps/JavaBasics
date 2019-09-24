<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Student</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit student</h1>
        <form:form action="saveStudent" method="post" modelAttribute="Student">
        <table>
            <tr>
                <td>RollNum:</td>
                <td><form:input path="Rollnum" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="sName" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="Age" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><form:input path="Gender" /></td>
            </tr>
            <tr>
                <td>Country:</td>
                <td><form:input path="Country" /></td>
            </tr>
            <tr>
                <td>Date OF Join:</td>
                <td><form:input path="dateOfJoin" /></td>
            </tr>
            <tr>
                <td>Final Score:</td>
                <td><form:input path="finalScore" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>