<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Apartment File</title>
</head>
<body>
 <div align="center">
  <h1>Update Apartment Form</h1>
  <form action="<%= request.getContextPath() %>/UpdateServlet" method="post">
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
   <input type="submit" value="Update" />
  </form>
 </div>
 <br/>
 <br/>
 <a href="<%=request.getContextPath() %>/view2.jsp">Click Here to see tenants</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantRegister.jsp">Click Here to add more tenants</a>
 <br/>
 <a href="<%=request.getContextPath() %>/tenantDelete.jsp">Click Here to delete tenant records</a>
</body>
</html>