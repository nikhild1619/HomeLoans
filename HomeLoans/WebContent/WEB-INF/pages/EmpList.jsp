<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List </title>
</head>
<body>
<h3>Registered Users</h3>
<table border="1">
<tr>
<th>Employee Id</th>
<th>First Name</th>
<th>Middle Name</th>
<th>Last Name</th>
<th>Phone</th>
<th>DOB</th>
<th>GENDER</th>
<th>NATIONALITY</th>
<th>AADHAR_NO</th>
<th>PAN_NO</th>

<th>Details of Employees</th>
</tr>
<c:forEach items="${empList}"  var="emp">
<tr>
<td>${emp.userid}</td>
<td>${emp.fname}</td>
<td>${emp.mname}</td>
<td>${emp.lname}</td>
<td>${emp.phone}</td>
<td>${emp.dob}</td>
<td>${emp.gender}</td>
<td>${emp.nation}</td>
<td>${emp.aadhar}</td>
<td>${emp.pan}</td>



<td><a href="empDetails.hr?id=${emp.userid}">Details of Employees</a></td>
<td><a href="home.hr">Back</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>