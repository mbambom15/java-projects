<%-- 
    Document   : find_outcome
    Created on : 27 Mar 2025, 10:56:29 PM
    Author     : nhlak
--%>

<%@page import="java.util.Date"%>
<%@page import="za.ac.tut.model.entity.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Find the outcome!</h1>
        <%
            
            Book book = (Book) request.getAttribute("book");
            String title = book.getTitle();
            String description = book.getDescription();
            String isbn = book.getIsbn();
            Long id = book.getId();
            Integer pages = book.getNoOfPages();
            Double price = book.getPrice();
            Date creationDate = book.getCreationDate();
            Boolean illustrations = book.getIllustration();
        %>
        <p>
            Below are the details
        </p>
        <form action="ModifyBookServlet" method="POST">
            <table>
                <tr>
                    <td>Title</td>
                    <td><input type="text" value="<%=title%>" name="title" disabled="" </td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><input type="text" value="<%=price%>" name="price" readonly="" </td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><input type="text" value="<%=description%>" name="description" disabled=""</td>
                </tr>
                <tr>
                    <td>ISBN</td>
                    <td><input type="text" value="<%=isbn%>" name="isbn" disabled=""</td>
                </tr>
                <tr>
                    <td>Number of pages </td>
                    <td><input type="text" value="<%=pages%>" name="pages" disabled=""</td>
                </tr>
          
                <tr>
                    <td>Has illustrations</td>
                    <td><input type="text" value="<%=illustrations%>" name="illustrations" disabled=""</td>
                </tr>
                <tr>
                    <td>Creation date</td>
                    <td><input type="text" value="<%=creationDate%>" name="creationDate" disabled="" </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="MODIFY" </td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
