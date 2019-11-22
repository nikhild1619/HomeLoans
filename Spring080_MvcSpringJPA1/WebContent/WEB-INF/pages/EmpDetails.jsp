<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h1>Larsen And Toubro Information Services!!!</h1>
<table border="1">
<tr>
<th>Employee Id</th>
<td>${emp.employeeId}</td>
</tr>
<tr>
<th>First Name</th>

<td>${emp.firstName}</td>
</tr>
<tr>
<th>Last Name</th>
<td>${emp.lastName}</td>
</tr>
<tr>
<th>Job Id</th>
<td>${emp.jobId}</td>
</tr>
<tr>
<th>Salary</th>
<td>${emp.salary}</td>
</tr>
<tr>
<th>Hire date</th>
<td>${emp.hireDate}</td>
</tr>
<tr>
<th>Email</th>
<td>${emp.email}</td>
</tr>
</table>
</body>
</html>