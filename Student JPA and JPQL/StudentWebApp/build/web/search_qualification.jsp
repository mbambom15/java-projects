<%-- 
    Document   : search_qualification
    Created on : 13 Apr 2025, 1:17:20 PM
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
        <h1>Enter a qualification to see the students who take it.</h1>
        <form action="QualificationSearchServlet" method="GET">
            <table>
                <tr>
                    <td>Enter the qualification you want to search: </td>
                    <td><input type="text" name="qualification" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="param" value="GET"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
