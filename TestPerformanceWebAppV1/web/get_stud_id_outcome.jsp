<%-- 
    Document   : get_stud_id_outcome
    Created on : 03 Apr 2025, 12:22:14 PM
    Author     : nhlak
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get Student using ID Outcome:</h1>
        <%
            Student p = (Student) request.getAttribute("student");
            Long id = p.getId();
            String name = p.getFirstName();
            String surname = p.getLastName();
            String gender = p.getGender();
            Integer age = p.getAge();
            Double percMarkObtained = p.getPercMarkObtained();
        %>
        <p>
            Below are the details of the student.
        </p>
        <table>
            <tr>
                <td>ID: </td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>Surname: </td>
                <td><%=surname%></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><%=age%></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td><%=gender%></td>
            </tr>
            <tr>
                <td>Mark obtained: </td>
                <td><%=percMarkObtained%></td>
            </tr>
        </table>
        <p>

            Click <a href="menu.jsp">here</a> to get back to menu <br> or <a href="index.html">here</a> for home.
        </p>
    </body>
</html>
