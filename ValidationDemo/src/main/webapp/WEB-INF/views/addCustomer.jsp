<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="adder.html" method="post" commandName="cust">
<table>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
<td><form:errors path="name" cssClass="error"/>
</td>
</tr>

<tr>
<td>City:</td>
<td><form:input path="city"/></td>
<td><form:errors path="city" cssClass="error"/>
</td>
</tr>

<tr>
<td>age:</td>
<td><form:input path="age"/></td>
<td><form:errors path="age" cssClass="error"/>
</td>
</tr>

</table>
<input type="submit" value="submit">
</form:form>
</body>
</html>