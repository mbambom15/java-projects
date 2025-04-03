<%-- 
    Document   : get_test_stats_outcome
    Created on : 03 Apr 2025, 11:45:14 AM
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
        <h1>Get list outcome.</h1>
        <%
            List<Student> list = (List<Student>) request.getAttribute("list");
            Integer cnt = (Integer) request.getAttribute("cnt");
            Double lowestMark = (Double) request.getAttribute("lowestMark");
            Double highestMark = (Double) request.getAttribute("highestMark");
            Double avgMark = (Double) request.getAttribute("avgMark");

            Integer cntPassed = (Integer) request.getAttribute("cntPassed");
            Integer cntFailed = (Integer) request.getAttribute("cntFailed");
            Integer numMales = (Integer) request.getAttribute("numMales");
            Integer numFemales = (Integer) request.getAttribute("numFemales");
            Integer numMalesPassed = (Integer) request.getAttribute("numMalesPassed");
            Integer numFemalesPassed = (Integer) request.getAttribute("numFemalesPassed");
            Integer numMalesFailed = (Integer) request.getAttribute("numMalesFailed");
            Integer numFemalesFailed = (Integer) request.getAttribute("numFemalesFailed");
        %>
        <table>
            <tr>
                <td>number of students who wrote: </td>
                <td><%=cnt%></td>
            </tr>
            <tr>
                <td>number of students who passed: </td>
                <td><%=cntPassed%></td>
            </tr>
            <tr>
                <td>number of students who failed: </td>
                <td><%=cntFailed%></td>
            </tr>
            <tr>
                <td>number of students whom are males: </td>
                <td><%=numMales%></td>
            </tr>
            <tr>
                <td>number of students whom are females: </td>
                <td><%=numFemales%></td>
            </tr>
            <tr>
                <td>number of students whom are males that passed: </td>
                <td><%=numMalesPassed%></td>
            </tr>
            <tr>
                <td>number of students whom are females that passed: </td>
                <td><%=numFemalesPassed%></td>
            </tr>
            <tr>
                <td>number of students whom are males that failed: </td>
                <td><%=numMalesFailed%></td>
            </tr>
            <tr>
                <td>number of students whom are females that failed: </td>
                <td><%=numFemalesFailed%></td>
            </tr>
            <tr>
                <td>Highest Mark</td>
                <td><%=highestMark%></td>
            </tr>
            <tr>
                <td>Lowest Mark</td>
                <td><%=lowestMark%></td>
            </tr>
            <tr>
                <td>Average Mark</td>
                <td><%=avgMark%></td>
            </tr>
        </table>
        <p>
            This is the classlist: 
        </p>
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
                <td>Mark Obtained: </td>
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
