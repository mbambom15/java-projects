<%-- 
    Document   : get_all
    Created on : 12 Apr 2025, 8:26:09 PM
    Author     : nhlak
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.bl.Studentv1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Students </title>
    </head>
    <body>
        <h1>All Students!</h1>
        <%
            List<Studentv1> student = (List<Studentv1>)request.getAttribute("students");
            for(Studentv1 stud: student){
                Long student_number = stud.getStudentNumber();
                String name = stud.getName();
                String surname = stud.getSurname();
                String qualification = stud.getQualification();
                String birthdate = stud.getBirthdate();
                String time_entered = stud.getTime();
                %>
                <table>
                    <tr>
                        <td>Student number</td>
                        <td><%=student_number%></td>
                    </tr>
                    <tr>
                        <td>Student name</td>
                        <td><%=name%></td>
                    </tr>
                    <tr>
                        <td>Student surname</td>
                        <td><%=surname%></td>
                    </tr>
                    <tr>
                        <td>Student qualification</td>
                        <td><%=qualification%></td>
                    </tr>
                     <tr>
                        <td>Student birth date:</td>
                        <td><%=birthdate%></td>
                    </tr>
                    <tr>
                        <td>Time student was created:</td>
                        <td><%=time_entered%></td>
                    </tr>
                    <br>
                </table>
                <%
            }
        %>
        <p>
            Click <a href="menu.jsp">here</a> to return to menu
        </p>
    </body>
</html>
