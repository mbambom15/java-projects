<%-- 
    Document   : add_outcome
    Created on : 12 Apr 2025, 8:08:44 PM
    Author     : nhlak
--%>

<%@page import="za.ac.tut.entity.bl.Studentv1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add outcome page</title>
    </head>
    <body>
        <h1>Add outcome</h1>

        <%
            Studentv1 student = (Studentv1) request.getAttribute("student");
            String message = (String) request.getAttribute("message");
            Long std_num = student.getStudentNumber();
        %>
        <p>
            Student <%=std_num%>: <%=message%>
        </p>

        <p>
            Click <a href="menu.jsp">here</a> to go back menu.
        </p>
    </body>
</html>
