<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.bl.Studentv1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search Page</title>
</head>
<body>
    <h1>Search Outcome...</h1>
    <%
        Boolean isFound = (Boolean) request.getAttribute("isFound");
        List<Studentv1> students = (List<Studentv1>) request.getAttribute("students");

        if (isFound != null && isFound && students != null && !students.isEmpty()) {
            for (Studentv1 student : students) {
                String name = student.getName();
                String surname = student.getSurname();
                Long studentNumber = student.getStudentNumber();
                String birth = student.getBirthdate();
                String time = student.getTime(); // corrected
    %>
    <table border="1" cellpadding="5">
        <tr><td>Name:</td><td><%= name %></td></tr>
        <tr><td>Surname:</td><td><%= surname %></td></tr>
        <tr><td>Student number:</td><td><%= studentNumber %></td></tr>
        <tr><td>Birth date:</td><td><%= birth %></td></tr>
        <tr><td>Student created:</td><td><%= time %></td></tr>
    </table>
    <br/>
    <% 
            }
        } else {
    %>
    <p><strong>No student found with the given name and surname.</strong></p>
    <% 
        } 
    %>
    <p>Click <a href="menu.jsp">here</a> to get back to menu</p>
</body>
</html>
