package aptPortfolioServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbServlet
 */
@WebServlet("/DbServlet")
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 private aptDao aptDao;

	    public void init() {
	        aptDao = new aptDao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String aptNum = request.getParameter("aptNum");
	        String Name = request.getParameter("tenName");
	        String tenPhone = request.getParameter("tenPhone");
	        String address = request.getParameter("address");
	        String manager = request.getParameter("manager");
	        
//	        this.aptNum = AptNum;
//			this.tenantName = TenantName;
//			this.tenantNum = TenantNum;
//			this.address = address;
//			this.manager = manager;
	        

	        Apartment apartment = new Apartment();
	        apartment.setAptNum(aptNum);
	        apartment.setTenantName(Name);
	        apartment.setTenantNum(tenPhone);
	        apartment.setAddress(address);
	        apartment.setManager(manager);
	        

	        try {
	            aptDao.registerTenant(apartment);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("tenantView.jsp");
	    }
    
	
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
