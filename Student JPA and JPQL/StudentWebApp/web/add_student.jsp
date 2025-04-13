<%-- 
    Document   : add_student
    Created on : 12 Apr 2025, 7:54:18 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
    </head>
    <body>
        <div align="center">
            <form action="AddStudentServ" method="POST">
                <table>
                    <tr>
                        <td>Student Number: </td>
                        <td><input type="text" name="stud_num" required="" /></td>
                    </tr>
                     <tr>
                        <td>Student Name: </td>
                        <td><input type="text" name="name" required="" /></td>
                    </tr>
                     <tr>
                        <td>Student Surname: </td>
                        <td><input type="text" name="surname" required="" /></td>
                    </tr>
                     <tr>
                         <td>Qualification : </td>
                        <td><input type="text" name="qualification" required="" /></td>
                    </tr>
                     <tr>
                        <td>Date of birth: </td>
                        <td><input type="date" name="birthdate" required="" /></td>
                    </tr>
                     <tr>
                        <td>Time entered: </td>
                        <td><input type="time" name="time" required="" /></td>
                    </tr>
                     <tr>
                        <td></td>
                        <td><input type="submit" value="ADD"/></td>
                    </tr>
                </table>
            </form>
            
        </div>
    </body>
</html>
