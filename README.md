# Apartment Manager App

The Apartment Manager app is designed to allow an apartment building manager to model one or more apartment buildings and manage tenant records for the residents of the buildings. 

It is designed as a CRUD (create, read update, delete) app with an MVC architecture. 

Built as a Dynamic Web Project in Eclipse, using Java to create an Apartment model, Tomcat’s Servlet api to create a Servlet container, JSP to create dynamic webpages, JSTL tags to send information to the Servlet Controller, and the JDBC driver to connect the Data Access Object to the MySQL DB.

## Motivation
The basic idea was to build something that would allow an apartment manager a simple solution to managing tenants in a building, requiring minimal technological knowledge on their end. The input method would be an internet form, and the database would save the data. Data would persist after the program is closed.   
 

## Installation
Copy files to local disk, run in preferred environment.
 
Eclipse IDE for Java EE Developers is recommended, but not necessary, Tomcat version 9 is required. 

Requires MySQL database setup with the following table in a database named "aptdb"


```SQL
CREATE TABLE `apartments` (
  `aptNum` varchar(45) NOT NULL,
  `tenName` varchar(45) DEFAULT NULL,
  `tenPhone` varchar(10) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `manager` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`aptNum`)
)
```

Changes will need to be made in the the connection methods to connect to your database

```java
protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://RelativePath goes here/aptdb", "YourUsername", "YourPassword");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
       
    }
```





## Usage

Use the register/update/delete JSP forms to manipulate the MySQL database:

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

```html
   
```

## Roadmap/Features 

### Issues:
The project currently has a different servlet controller for each post method. This was easier to develop, but doesn't strictly adhere to the standard MVC architecture model. 

Query system is not robust, only lists all entries in database, updates an entry, creates new entry, deletes row based on PK. No custom queries functions are implemented.

### Roadmap:
Rebuild as a Spring Boot project to make configuring XML and database transactions easier, as well as managing REST endpoints.
 
Implementing Hibernate framework to add object relational mapping (ORM) functionality to map the class objects to the relational database.

CSS to make the forms and user view look better.

Server-side input validation to prevent SQL injection attacks.


## Contact

Dennis Jones
