<%-- 
    Document   : faculty
    Created on : 25 Apr 2025, 2:43:53 PM
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
        <h1>Click below to get all the stats.</h1>
        <form action="GetStatsServlet" method="GET">
            <table>
                <tr>
                    <td><input type="submit" value="GET STATS"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
