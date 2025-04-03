<%-- 
    Document   : get_test_stats
    Created on : 03 Apr 2025, 11:25:00 AM
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
        <h1>Get test statistics</h1>
        <p>
            Please click below to get statistics. 
        </p>
        <form action="GetTestStatsServlet" method="GET">
            <table >
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET TEST STATISTICS"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
