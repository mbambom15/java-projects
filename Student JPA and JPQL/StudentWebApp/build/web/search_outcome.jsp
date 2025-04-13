<%-- 
    Document   : search_outcome
    Created on : 12 Apr 2025, 10:50:49 PM
    Author     : nhlak
--%>

<%@page import="za.ac.tut.entity.bl.Studentv1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search outcome</title>
    </head>
    <body>
        <h1>Student Search...</h1>
        <%
            Studentv1 student = (Studentv1) request.getAttribute("stud");
            Boolean found = (Boolean) request.getAttribute("found");

            String name = student.getName();
            String surname = student.getSurname();
            String qualification = student.getQualification();
            String birthdate = student.getBirthdate();
            String time = student.getTime();

            if (found) {
        %>
        <p>Student has been found. </p>
        <p><%=name%>  <%=surname%> <br> has qualification: <%=qualification%> <br> born:<%=birthdate%> <br> created at: <%=time%></p>
        <%
        } else {
        %>
        <p> Student not found! </p>
        <%
            }
        %>
        <p>
            Click <a href="menu.jsp">here</a> to access menu.
        </p>
    </body>
</html>
