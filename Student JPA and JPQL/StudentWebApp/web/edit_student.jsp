<%-- 
    Document   : edit_student
    Created on : 12 Apr 2025, 11:09:27 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit page</title>
    </head>
    <body>
        <h1>Edit student qualification.</h1>
        <form action="EditStudentServ" method="POST">
            <table>
                <tr>
                    <td>Enter the student number to update qualification: </td>
                    <td><input type="text" name="std_num" required=""</td>
                </tr>
                <tr>
                    <td>Enter the student new qualification: </td>
                    <td><input type="text" name="quaili" required=""</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="EDIT"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
