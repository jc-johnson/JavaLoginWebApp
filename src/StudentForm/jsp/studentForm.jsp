<html>
    <head>
        Submit Student Form
    </head>

    <body>
        <h1>Add a New Student</h1> </br>
        <form name="studentSubmitForm" method="post" action="bstudentServlet">
            First Name: <input type="text" name="firstName"/> <br/>
            Last Name: <input type="text" name="lastName"/> <br/>
            Address: <input type="text" name="address"/> <br/>
            Phone Number: <input type="text" name="phone"/> <br/>
            School: <input type="text" name="school"/> <br/>
            Sex: <select name="sex">
            	<option value="male">MALE</option>
            	<option value="female">FEMALE</option>
            </select>
            <input type="submit" value="Add Student" />
        </form>
    </body>
</html>
