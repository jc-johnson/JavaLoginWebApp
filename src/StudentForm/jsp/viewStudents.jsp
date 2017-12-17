<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
    <titleView Current Students</title>
    <style type="text/css">
        body{background-color: green;}
    </style>
</head>
<body>
    <h1>View Current Students</h1>
    <form name="viewStudentForm" method="post" action="../viewStudentsServlet" >
        <label><h2>Enter your query and click the button to invoke a MySQL Servlet</h2> </label>
            <br>
            <textarea name = "query" cols="20" rows="5"></textarea>
            <br><p>
            <input type = "submit" value = "Run MySQL Servlet" />
            <br><p>
            <input type = "reset" value = "Clear Command" />
    </form>
    <hr>
</body>
</html>
