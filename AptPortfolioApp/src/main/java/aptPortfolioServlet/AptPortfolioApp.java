package aptPortfolioServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


import javax.annotation.Resource;
/**
 * Servlet implementation class AptPortfolioApp
 */
@WebServlet("/AptPortfolioApp")
public class AptPortfolioApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//doesn't work
	//@Resource(name= "jdbc/project")
	//private DataSource dataSource;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("<h1>Apartment Portfolio Manager</h1>");
		PrintWriter out = response.getWriter();
		
//		String param = "AptBuilding";
//		//getParameter("page");
//		if(param.equals("AptBuilding") ){
//			//getServletContext().getRequestDispatcher("/AptBuilding.jsp").forward(request, response);
//		}
//		else if(param.equals("AptTenants") ){
//			getServletContext().getRequestDispatcher("/AptTenants.jsp").forward(request, response);
//		}
		
		
	
	//initialize connection objects
	Connection connect = null;
	Statement stmt = null;
	ResultSet rs = null;
	//this part was so hard to figure out, almost quit
	//connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aptdb", "root", "tomcat");
	connect=getConnection();

	// create sql statement strings
	
	//Get all data from buildingName in building table
	String query1 = "Select * from apartments";
	try {
		stmt =connect.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//execute sql queries
	try {
		rs = stmt.executeQuery(query1);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//process the result list
	try {
		while(rs.next()) {
			out.print(" " + rs.getString("aptNum") 
			+ " " + rs.getString("tenName")
			+ " " + rs.getString("tenPhone")
			+ " " + rs.getString("address")
			+ " " + rs.getString("manager"));
			out.print("<br/>");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	//connection get method
	protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aptdb", "root", "tomcat");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
	


}
