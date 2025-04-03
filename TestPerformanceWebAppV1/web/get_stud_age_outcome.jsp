<%-- 
    Document   : get_stud_age_outcome
    Created on : 03 Apr 2025, 12:57:23 PM
    Author     : nhlak
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>get students age outcome</h1>
        <%
            List<Student> list = (List<Student>) request.getAttribute("list");
            Integer minAge = (Integer) request.getAttribute("minAge");
            Integer maxAge = (Integer) request.getAttribute("maxAge");
        %>
        <table>
            <%
                for (int i = 0; i < list.size(); i++) {
                    Student p = list.get(i);
                    Long id = p.getId();
                    String name = p.getFirstName();
                    String surname = p.getLastName();
                    String gender = p.getGender();
                    Integer age = p.getAge();
                    Double percMarkObtained = p.getPercMarkObtained();
            %>
            
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
            
            <%
                }
            %>
        </table>
        <p>
            Click <a href="menu.jsp">here</a> to get back to menu <br> or <a href="index.html">here</a> for home.
        </p>
    </body>
</html>
