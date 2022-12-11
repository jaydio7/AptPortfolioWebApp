<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apt Manager Portfolio</title>
</head>
<body>
<h1>Welcome to the Apartment manager</h1>
<form action="<%=request.getContextPath() %>/AptPortfolioApp" method="post">
	Tenant Name: <input type="text" name="nameTen"><br/>
	Apt Number: <input type="text" name="nameApt"><br/>
	Tenant Phone Number: <input type="text" name="nameNum"><br/>
	
	<br/>
	<input type="submit" value="Submit">
	<br/>
	<br/>
	<br/>
	
	<a href="<%=request.getContextPath() %>/AptPortfolioApp?page=AptBuilding">Managers Click Here</a>
	

</form>
</body>
</html>