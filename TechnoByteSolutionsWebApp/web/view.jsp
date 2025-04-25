<%-- 
    Document   : view
    Created on : 25 Apr 2025, 2:36:24 PM
    Author     : nhlak
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.Industry"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All projects</h1>
        <%
            List<Industry> industries = (List<Industry>) request.getAttribute("industry");
        %>

        <table border="1">
            <%
                for (Industry ind : industries) {
                    Long id = ind.getId();
                    String compName = ind.getComp_name();
                    String t1 = ind.getTitle1();
                    String d1 = ind.getDesc1();
                    String t2 = ind.getTitle2();
                    String d2 = ind.getDesc2();
                    String t3 = ind.getTitle3();
                    String d3 = ind.getDesc3();
            %>
            <tr>
                <td>Company ID</td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>Company name</td>
                <td><%=compName%></td>
            </tr>
            <tr>
                <td>Project One</td>
                <td><%=t1%></td>
            </tr>
            <tr>
                <td>Descrption One</td>
                <td><%=d1%></td>
            </tr>
            <tr>
                <td>Project Two</td>
                <td><%=t2%></td>
            </tr>
            <tr>
                <td>Descrption Two</td>
                <td><%=d2%></td>
            </tr>
            <tr>
                <td>Project Three</td>
                <td><%=t3%></td>
            </tr>
            <tr>
                <td>Descrption Three</td>
                <td><%=d3%></td>
            </tr>
            <%
                }
            %>
        </table>
        <p>
            Click <a href="menu.jsp">here</a> to go back to menu
        </p>
    </body>
</html>
