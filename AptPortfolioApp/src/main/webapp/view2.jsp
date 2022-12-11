<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tenant Records</title>
</head>
<body>
        
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://127.0.0.1:3306/aptdb"
        user="root" password="tomcat"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM apartments;
    </sql:query>
    
    <h2>Apt Manager</h2>
     
    <div align="center">
        <table border="1" cellpadding="5">
        <h2>List of users</h2>
            
            <tr>
                <th>AptNum</th>
                <th>Tenant Name</th>
                <th>Tenant Phone</th>
                <th>Address</th>
                <th>Manager</th>
            </tr>
            <c:forEach var="tenant" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${tenant.aptNum}" /></td>
                    <td><c:out value="${tenant.tenName}" /></td>
                    <td><c:out value="${tenant.tenPhone}" /></td>
                    <td><c:out value="${tenant.address}" /></td>
                    <td><c:out value="${tenant.manager}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    
    
 	<br/>
 	<br/>
 	<a href="<%=request.getContextPath() %>/tenantRegister.jsp">Click Here to add more tenants</a>
 	<br/>
 	<a href="<%=request.getContextPath() %>/tenantDelete.jsp">Click Here to delete tenant records</a>
 	<br/>
 	<a href="<%=request.getContextPath() %>/tenantUpdate.jsp">Click Here to update tenant records</a>
</body>
</html>