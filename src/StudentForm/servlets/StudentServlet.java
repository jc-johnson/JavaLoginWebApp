package StudentForm.servlets;

import StudentForm.beans.LoginBean;
import StudentForm.beans.StudentBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phone");
        String school = request.getParameter("school");
        String sex = request.getParameter("sex");

        StudentBean studentBean = new StudentBean();
        studentBean.setFirstName(firstName);
        studentBean.setLastName(lastName);
        studentBean.setAddress(address);
        studentBean.setSchoolName(school);
        studentBean.setPhoneNumber(phoneNumber);
        studentBean.setSex(sex);

        request.setAttribute("bean", studentBean);

        boolean status = true;

        if(status){
            RequestDispatcher rd = request.getRequestDispatcher("studentForm-Success.jsp");
            rd.forward(request, response);
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("studentForm-Error.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
