<%-- 
    Document   : get_stud_namesurname_outcome
    Created on : 03 Apr 2025, 1:06:49 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
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
    </body>
</html>
