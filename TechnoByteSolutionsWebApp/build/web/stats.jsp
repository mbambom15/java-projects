<%-- 
    Document   : stats
    Created on : 25 Apr 2025, 2:56:12 PM
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
        <h1>All statisctcs yeah</h1>
        <%
            Integer cntStudents = (Integer) request.getAttribute("value");
            Integer cntCompanies = (Integer) request.getAttribute("companies");
            Integer cntProjects = (Integer) request.getAttribute("projects");
        %>
        <p>
            The number of studnets is: <%=cntStudents%>
        </p>
        <p>
            The number of companies is: <%=cntCompanies%>
        </p>
        <p>
            The number of projects is: <%=cntProjects%>
        </p>
        <p>
            click <a href="menu.jsp">here</a> to go back to menu.
        </p>
    </body>
</html>
