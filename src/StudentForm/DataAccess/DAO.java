package StudentForm.DataAccess;

import java.sql.*;

public class DAO {

    public static void query(String table) {

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            String url = "jdbc:odbc:employee_dsn";
            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from emp_table");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
