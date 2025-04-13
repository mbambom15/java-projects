<%-- 
    Document   : delete_outcome
    Created on : 12 Apr 2025, 11:40:40 PM
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
        <h1>Remove user.</h1>
        <%
            Boolean remove = (Boolean) request.getAttribute("remove");
            if (remove) {
        %>
        <p>Student has been removed.</p>
        <%
        } else {
        %>
        <p>Unknown!</p>
        <%
            }
        %>
        <p>
            Click <a href="menu.jsp">here</a> to access menu again
        </p>
    </body>
</html>
