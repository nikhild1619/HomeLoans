<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
	<head> 
    <link rel="stylesheet" type="text/css" href="mystyle.css">
	<title>Registration Page</title> 
	<link href="mystyle.css" rel="stylesheet" type="text/css">
	</head> 
	<body> 
	<ul>
  <li><a class="active" href="HomePage.jsp">HOMEPAGE</a></li>
  <li><a href="AboutUs.jsp">ABOUT US</a></li>
  <li><a href="MainCalculator.jsp">CALCULATOR</a></li>
  <li><a href="Faq.jsp">FAQs</a></li>
  <li><a href="Registration.jsp">APPLY NOW</a></li>
  <li style="float:right"><a class="active" href="LoginPage.jsp">LOGIN</a></li>
</ul>
	
		<%-- The form data will be passed to acceptuser.jsp 
			for validation on clicking submit 
		--%> 
		
		<form name="registrationform" method="post" action="registration.hr"> 
		<div class = "container">
		<fieldset>
		<br><br> 
		<br> 
		<legend>Registration</legend>
		<table>
		<tr>
			 <td>User Id</td><td><input type="text" name="userId" required><br><br> </td>
		</tr>
		<tr>
			 <td>First Name</td><td><input type="text" name="firstname" required><br><br> </td>
		</tr>	 
		<tr>
			 <td>Middle Name</td><td><input type="text" name="middlename" required><br/></br></td>
		</tr>
		<tr>
			<td>Last Name</td><td>  <input type="text" name="lastname" required><br/></br> </td>
		</tr>	 
		
		<tr>
			<td>Contact Number</td><td> <input type="text" name ="contactnumber" required><br/></br> </td>
		</tr>	 
		<tr>
			<td>Date Of Birth</td><td> <input type="date" name ="dateofbirth"><br/></br>  </td>
		</tr>	 
		<tr>
			<td>Gender</td><td><input type="radio" name ="gender" value="male">Male<input type="radio" name ="gender" value="female">Female<input type="radio" name ="gender" value="other">Other<br></br></td> 
			 		
		</tr>		
			 <tr><td>Nationality</td><td> <select name="nationality" required>
				<option value="indian">Indian</option>
				<option value="other">Other</option>
				</select>
			</tr>
			<br><br>
			<tr><td>Aadhaar Number</td><td><input type="text" name ="aadharnumber" required><br/><br/></td>
			</tr>
			
			<tr><td>PAN Number</td><td> <input type="password" name ="pass" required><br/></br> </td>		
			</tr>
		</table>
		<fieldset>
		<br>
		<table>
		<legend>SIGN UP</legend>
		
			<tr>
			<td>Email Id</td><td><input type="text" name="emailid" required><br/></br></td>
		
		</tr>	 
		<tr>
			<td>Password</td><td><input type="password" name ="password" required><br/></br></td> 
		</tr>	 
		
		<tr>
			<td>Confirm Password</td><td><input type="password" name ="confirmpassword" required><br/></br></td> 
		</tr>
		</fieldset>	 
			 </table>
			 <button>SUBMIT</button>
		
        </fieldset>
        <div class="container signin">
    <p>Already have an account? <a href="LoginPage.jsp">Log In</a>.</p>
        </div>
        </div>
				</form>
	</body>
</html> 
	
