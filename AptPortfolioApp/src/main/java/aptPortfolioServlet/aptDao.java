package aptPortfolioServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import aptPortfolioServlet.Apartment; 
import aptPortfolioServlet.ApartmentBuilding; 


public class aptDao {
	
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
	
	public int registerTenant(Apartment apartment) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO apartments" +
            "  (aptNum, tenName, tenPhone, address, manager) VALUES " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        

        try (Connection connection = getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            //preparedStatement.setInt(1, 1);
            preparedStatement.setString(1, apartment.getAptNum());
            preparedStatement.setString(2, apartment.getTenantName());
            preparedStatement.setString(3, apartment.getTenantNum());
            preparedStatement.setString(4, apartment.getAddress());
            preparedStatement.setString(5, apartment.getManager());
            

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }
	
	public boolean deleteUser(String aptNum) throws SQLException {
        boolean rowDeleted;
        String DELETE_USERS_SQL = "delete from apartments where aptNum = ?;";
        

        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL)){
            statement.setString(1, aptNum);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
	
	public boolean updateApt(Apartment apartment) throws SQLException {
        boolean rowUpdated;
        //, , , address, manager
        String UPDATE_USERS_SQL = "update apartments set tenName = ?,tenPhone= ?, address =?, manager =? where aptNum = ?;";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
        	
            statement.setString(1, apartment.getTenantName());
            statement.setString(2, apartment.getTenantNum());
            statement.setString(3, apartment.getAddress());
            statement.setString(4, apartment.getManager());
            
            statement.setString(5, apartment.getAptNum());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }


    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}


