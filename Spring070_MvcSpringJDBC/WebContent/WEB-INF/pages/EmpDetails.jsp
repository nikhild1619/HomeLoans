<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Larson and Toubro information Services</h1>
	<table>
			<tr>
					<th>Employee Id</th>
					<td>${emp.empid}</td>
					</tr>	
					
			<tr>
					<th>First Name</th>
					<td>${emp.firstname}</td>
			</tr>	
			
			<tr>
					<th>Last Name</th>
					<td>${emp.lastname}</td>
			</tr>	
	</table>
	
	<button onclick="window.location.href = 'empList.hr';">Go back</button>
	
	<button onclick="window.location.href = 'home.hr';">Go Home</button>

</body>
</html>