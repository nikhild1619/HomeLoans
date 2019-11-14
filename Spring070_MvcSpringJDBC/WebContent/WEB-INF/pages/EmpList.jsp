<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Larson and Toubro Information Services</h1>
<table border="1">
	<tr>
		<th>Employee_id</th>
		<th>Firstname</th>
		<th>Last Name</th>
		<th>View Details</th>
		</tr>
		
		<c:forEach items="${empList}" var="emp">
		<tr>
			<td>${emp.empid}</td>
			<td>${emp.firstname }
			<td>${emp.lastname}</td>
			<td><a href="empDetails.hr?id=${emp.empid}">View Details</a></td>
		</tr>
		</c:forEach>
</table>
<a href =""></a>

</body>
</html>