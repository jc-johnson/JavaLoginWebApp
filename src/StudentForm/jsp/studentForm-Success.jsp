<%@page import="StudentForm.beans.StudentBean"%>

<p> You successfully submitted a Student! </p>
<%
    StudentBean studentBean = (StudentBean)request.getAttribute("bean");
    out.print(bean.getFirstName() + "" + bean.getLastName() + "added to database");
%>

<form action="jsp/home.jsp">
    <input type="submit" value="Continue" />
</form>