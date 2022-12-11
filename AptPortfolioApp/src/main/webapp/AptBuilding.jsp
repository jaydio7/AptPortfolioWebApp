<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apt Building Manager</title>
</head>
<body>
<h1>Welcome to the Apartment Building manager</h1>
<form action="<%=request.getContextPath() %>/AptPortfolioApp" method="get">
	Apt Building Name: <input type="text" name="nameA"><br/>
	Apt Manager Name: <input type="text" name="nameB"><br/>
	Apt Building address: <input type="text" name="nameC"><br/>
	
	<br/>
	<input type="submit" value="Submit">
	<br/>
	<br/>
	<br/>
	
	<a href="<%=request.getContextPath() %>/AptPortfolioApp?page=AptTenants">Tenants Click Here</a>
	
	

</form>
</body>
</html>