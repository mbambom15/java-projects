<%-- 
    Document   : add_industry
    Created on : 25 Apr 2025, 1:26:54 PM
    Author     : nhlak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add page</title>
    </head>
    <body>
        <h1>Enter company details</h1>
        <form action="AddProjectServlet" method="POST">
            <table border="1">
                <tr>
                    <td>Company ID</td>
                    <td><input type="text" name="id" required=""/></td>
                </tr>
                 <tr>
                    <td>Company name</td>
                    <td><input type="text" name="name" required=""/></td>
                </tr>
                 <tr>
                    <td>Project Title 1: </td>
                    <td><input type="text" name="t1" required=""/></td>
                </tr>
                 <tr>
                    <td>Project 1 Description:</td>
                    <td><input type="text" name="d1" required=""/></td>
                </tr>
                <tr>
                    <td>Project Title 2: </td>
                    <td><input type="text" name="t2" required=""/></td>
                </tr>
                 <tr>
                    <td>Project 2 Description:</td>
                    <td><input type="text" name="d2" required=""/></td>
                </tr>
                <tr>
                    <td>Project Title 3: </td>
                    <td><input type="text" name="t3" required=""/></td>
                </tr>
                 <tr>
                    <td>Project 3 Description:</td>
                    <td><input type="text" name="d3" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
