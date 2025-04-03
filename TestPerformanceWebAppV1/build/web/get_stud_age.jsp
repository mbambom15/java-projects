<%-- 
    Document   : get_stud_age
    Created on : 03 Apr 2025, 12:40:19 PM
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
        <h1>Get student using age:</h1>
        <form action="GetStudentAgeServ" method="POST">
            <table>
            <tr>
                <td>Minimum age: </td>
                <td><input type="text" name="minAge"/></td>
            </tr>
            <tr>
                <td>Max age: </td>
                <td><input type="text" name="maxAge"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="GET"/></td>
            </tr>
        </table>
        </form>
    </body>
</html>
