<%-- 
    Document   : edit_outcome
    Created on : 12 Apr 2025, 11:20:58 PM
    Author     : nhlak
--%>

<%@page import="za.ac.tut.entity.bl.Studentv1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
    </head>
    <body>
        <h1>Update page</h1>
        <%
            String old = (String) request.getAttribute("old");
            Studentv1 stud = (Studentv1) request.getAttribute("student");
            Long std_num = (Long) request.getAttribute("std_num");
            String new_q = stud.getQualification();
        %>
        <p>
            Student number: <%=std_num%>
            <br>
            Old Qualification: <%=old%>
            <br>
            New Qualification: <%=new_q%>

        </p>
        <p>
            Click <a href="menu.jsp">here</a> to access menu.
        </p>
    </body>
</html>
