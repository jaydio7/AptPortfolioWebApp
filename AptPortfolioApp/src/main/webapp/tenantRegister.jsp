<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apt Registration</title>

</head>
<body>
 <div align="center">
  <h1>Tenant Registration Form</h1>
  <form action="<%= request.getContextPath() %>/DbServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td>Apt Number</td>
     <td><input type="text" name="aptNum" class="form-control" required="required"/></td>
    </tr>
    <tr>
     <td>Tenant Name</td>
     <td><input type="text" name="tenName" class="form-control" required="required"/></td>
    </tr>
    <tr>
     <td>Phone Num</td>
     <td><input type="text" name="tenPhone" class="form-control" required="required"/></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" class="form-control" required="required"/></td>
    </tr>
    <tr>
     <td>Manager</td>
     <td><input type="text" name="manager" class="form-control" required="required"/></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
 
 <br/>
 <br/>
 <a href="<%=request.getContextPath() %>/view2.jsp">Click Here to see tenants</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantDelete.jsp">Click Here to delete tenant records</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantUpdate.jsp">Click Here to update tenant records</a>
</body>
</html>