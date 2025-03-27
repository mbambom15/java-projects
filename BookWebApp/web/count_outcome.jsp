<%-- 
    Document   : count_outcome
    Created on : 27 Mar 2025, 10:47:29 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Count Page</title>
    </head>
    <body>
        <h1>Records Count Outcome Page</h1>
        <%
            Integer cnt = (Integer)request.getAttribute("cnt");
        %>
        <p>
            There are <%=cnt%> in database
        </p>
        <ul>
            <li><a href="menu.html">Menu page</a></li>
            <li><a href="index.html">Home page</a></li>
        </ul>e
    </body>
</html>
