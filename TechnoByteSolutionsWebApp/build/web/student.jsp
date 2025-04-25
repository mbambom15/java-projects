<%-- 
    Document   : student
    Created on : 25 Apr 2025, 2:24:35 PM
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
        <h1>Click below to view all projects available to you.</h1>
        <form action="StudentViewServlet" method="GET">
            <table>
                <td><input type="submit" name="param" value="GET"/></td>
            </table>
        </form>
    </body>
</html>
