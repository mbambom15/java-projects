<%-- 
    Document   : search_fullname
    Created on : 13 Apr 2025, 12:33:43 PM
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
        <h1>Enter student name and surname to search for: </h1>
        <form action="SearchName_SurnameServlet" method="POST">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" required=""/></td>
                </tr>
                 <tr>
                    <td>Surname: </td>
                    <td><input type="text" name="surname" required=""/></td>
                </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit" name="param" value="SEARCH..."/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
