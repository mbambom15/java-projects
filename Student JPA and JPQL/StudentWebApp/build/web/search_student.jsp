<%-- 
    Document   : search_student
    Created on : 12 Apr 2025, 8:40:57 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search For Student</title>
    </head>
    <body>
        <h1>Enter student number of student you want to find.</h1>
        <form action="SearchStudentServ" method="POST">
            <table>
                <tr>
                    <td>Student number</td>
                    <td><input type="text" name="stud_num" required=""/></td>
                </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit" name="param" value="SEARCH"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
