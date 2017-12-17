package StudentForm.DataAccess;

import StudentForm.beans.StudentBean;

import java.sql.*;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private Connection initialize() {
        // JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/test";

        //  Database credentials
        final String USER = "username";
        final String PASS = "password";


        Connection connection = null;
        Statement statement = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");

            connection = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    @Override
    public void saveOrUpdate(StudentBean studentBean) {

    }

    @Override
    public void delete(int studentId) {

    }

    @Override
    public void delete(String studentName) {

    }

    @Override
    public StudentBean get(int studentId) {

        Connection connection = initialize();

        if (connection != null) {
            System.out.println("Creating statement...");

            try {
                Statement statement = connection.createStatement();
                String sqlQuery;
                sqlQuery = "SELECT id FROM Students";
                ResultSet resultSet = statement.executeQuery(sqlQuery);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public List<StudentBean> list() {
        return null;
    }
}
