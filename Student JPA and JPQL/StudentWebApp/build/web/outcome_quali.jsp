<%-- 
    Document   : outcome_quali
    Created on : 13 Apr 2025, 1:33:10 PM
    Author     : nhlak
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.bl.Studentv1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <%
            String quali = (String) request.getAttribute("qualification");
        %>
        <h1>Students with <strong><%=quali%></strong> qualification </h1>
        <%
            List<Studentv1> students = (List<Studentv1>) request.getAttribute("students");
            Boolean isFound = (Boolean) request.getAttribute("isFound");
            if (isFound) {
                for(Studentv1 student: students){
                String name = student.getName();
                String surname = student.getSurname();
                Long std_num = student.getStudentNumber();
                %>
                <table>
                    <tr>
                        <td>Name</td>
                        <td><%=name%></td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td><%=surname%></td>
                    </tr>
                    <tr>
                        <td>Student number</td>
                        <td><%=std_num%></td>
                    </tr>
                </table>
                <%
            }
                
        %>
        
        <%
            } else {
            %>
            <p>No student takes that course!</p>
            <%
            }
        %>
        <p>
            Click <a href="menu.jsp">here</a> to go back to menu
        </p>
    </body>
</html>
