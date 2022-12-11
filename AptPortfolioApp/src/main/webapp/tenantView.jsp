<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="aptPortfolioServlet.aptDao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Update successful!</h1>
 <a href="<%=request.getContextPath() %>/view2.jsp">Click Here to see who's added</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantRegister.jsp">Click Here to add more tenants</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantDelete.jsp">Click Here to delete tenant records</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantUpdate.jsp">Click Here to update tenant records</a>
</body>
</html>