<%-- 
    Document   : edit
    Created on : 25 Apr 2025, 1:56:19 PM
    Author     : nhlak
--%>

<%@page import="za.ac.tut.entity.Industry"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter you new projects:</h1>
        <%
           Long id = (Long) request.getAttribute("id");
          Industry industry = (Industry)request.getAttribute("industry");
          String company = industry.getComp_name();
          String t1 = industry.getTitle1();
          String d1 = industry.getDesc1();
          String t2 = industry.getTitle2();
          String d2 = industry.getDesc2();
          String t3 = industry.getTitle3();
          String d3 = industry.getDesc3();
        %>
        <form action="EndEditServlet" method="POST">
            <table border="1">
            <tr>
                <td>Name</td>
                <td><%=company%></td>
            </tr>
            <tr>
                <td>Comp Id</td>
                <td> <input type="text" name="id" readonly="" value="<%=id%>"</td>
            </tr>
            <tr>
                <td>Project One:</td>
                <td> <input type="text" name="t1"  value="<%=t1%>"</td>
            </tr>
            <tr>
                <td>Description One:</td>
                <td> <input type="text" name="d1"  value="<%=d1%>"</td>
            </tr>
            <tr>
                <td>Project Two:</td>
                <td> <input type="text" name="t2"  value="<%=t2%>"</td>
            </tr>
            <tr>
                <td>Description Two:</td>
                <td> <input type="text" name="d2"  value="<%=d2%>"</td>
            </tr>
            <tr>
                <td>Project Three:</td>
                <td> <input type="text" name="t3"  value="<%=t3%>"</td>
            </tr>
            <tr>
                <td>Description Three:</td>
                <td> <input type="text" name="d3"  value="<%=d3%>"</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="EDIT"/></td>
            </tr>
        </table>
        </form>
    </body>
</html>
