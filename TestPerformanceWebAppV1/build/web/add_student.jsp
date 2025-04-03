<%-- 
    Document   : add_student
    Created on : 03 Apr 2025, 10:57:15 AM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Student</h1>
        <p>
            Please add student details below:
        </p>
        <form action="AddStudentServlet" method="POST">
            <table>
                <tr>
                    <td>Student number: </td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Surname: </td>
                    <td><input type="text" name="surname"/></td>
                </tr>
                <tr>
                    <td>Age: </td>
                    <td><input type="text" name="age"/></td>
                </tr>
                <tr>
                    <td>Gender: </td>
                    <td>
                        <select name="gender">
                            <option value="F">F</option>
                            <option value="M">M</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Mark obtained: </td>
                    <td><input type="text" name="percMarkObtained"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
