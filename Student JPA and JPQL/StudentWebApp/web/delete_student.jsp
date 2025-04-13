<%-- 
    Document   : delete_student
    Created on : 12 Apr 2025, 11:34:00 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <h1>Delete Student</h1>
        <form action="DeleteStudentServ" method="POST">
            <table>
                <tr>
                    <td>Enter the student's ,student number you want to delete.</td>
                    <td><input type="text" name="std_num" required=""</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit"value="DELTE"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
