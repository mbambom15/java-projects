<%-- 
    Document   : edit_industry
    Created on : 25 Apr 2025, 1:47:30 PM
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
        <h1>Enter company ID: </h1>
        <form action="StartEditServlet" method="POST">
            <table>
                <tr>
                    <td>Company ID:</td>
                    <td><input type="text" name="id" required=""</td>
                </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit" value="GET"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
