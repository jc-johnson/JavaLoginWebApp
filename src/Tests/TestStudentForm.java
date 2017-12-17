package Tests;

import StudentForm.DataAccess.StudentDAO;
import StudentForm.DataAccess.StudentDAOImpl;
import StudentForm.beans.StudentBean;
import org.junit.Assert;
import org.junit.Test;

public class TestStudentForm {

    @Test
    public void TestSqlAddStatement() {
        StudentDAO studentDAO = new StudentDAOImpl();
        StudentBean studentBean = studentDAO.get(113);
        Assert.assertEquals("Stephanie", studentBean.getFirstName());
    }
}
