package StudentForm.DataAccess;

import StudentForm.beans.StudentBean;

import java.sql.*;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private Connection initialize() {
        // JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        // jdbc:mysql://127.0.0.1:3306/?user=root;

        //  Database credentials
        final String USER = "root";
        final String PASS = "root";


        Connection connection = null;
        Statement statement = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

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

    public void addStudent(StudentBean studentBean) {

    }

    @Override
    public StudentBean get(int studentId) {

        Connection connection = initialize();
        Statement statement = null;
        StudentBean studentBean = new StudentBean();

        if (connection != null) {
            System.out.println("Creating statement...");

            try {
                statement = connection.createStatement();
                String sqlQuery;
                sqlQuery = "SELECT * FROM Student";
                ResultSet resultSet = statement.executeQuery(sqlQuery);

                //Extract data from result set
                while(resultSet.next()){
                    if (resultSet.getInt("idStudent") == studentId) {

                        int id  = resultSet.getInt("idStudent");
                        String first = resultSet.getString("firstName");
                        String last = resultSet.getString("lastName");
                        String address = resultSet.getString("address");
                        String phone = resultSet.getString("phoneNumber");
                        String school = resultSet.getString("school");
                        String sex = resultSet.getString("sex");

                        studentBean.setFirstName(first);
                        studentBean.setLastName(last);
                        studentBean.setAddress(address);
                        studentBean.setPhoneNumber(phone);
                        studentBean.setSchoolName(school);
                        studentBean.setSex(sex);

                        // Display values
                        System.out.print("ID: " + id);
                        System.out.print(", First: " + first);
                        System.out.println(", Last: " + last);
                        System.out.println(", Address: " + address);
                        System.out.println(", Phone: " + phone);
                        System.out.println(", School: " + school);
                        System.out.println(", Sex: " + sex);
                    }
                }
                // Clean-up environment
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                // finally block used to close resources
                try{
                    if(statement!=null)
                        statement.close();
                }catch(SQLException sqlException){
                    sqlException.printStackTrace();
                }
                try{
                    if(connection!=null)
                        connection.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }
            }
        }

        return studentBean;
    }

    @Override
    public List<StudentBean> list() {
        return null;
    }

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();
        StudentBean studentBean = studentDAO.get(113);
    }
}
