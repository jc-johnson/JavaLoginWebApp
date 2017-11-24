<%@page import="beans.LoginBean"%>

<p> You are successfully logged in! </p>
<%
    LoginBean bean = (LoginBean)request.getAttribute("bean");
    out.print("Welcome, " + bean.getName());
%>


<form action="jsp/home.jsp">
    <input type="submit" value="Continue" />
</form>