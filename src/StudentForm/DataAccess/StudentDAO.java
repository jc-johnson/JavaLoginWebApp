package StudentForm.DataAccess;

import StudentForm.beans.StudentBean;

import java.util.List;

public interface StudentDAO {

    public void saveOrUpdate(StudentBean student);

    public void delete(int studentId);

    public void delete(String studentName);

    public StudentBean get(int studentId);

    public List<StudentBean> list();
}
