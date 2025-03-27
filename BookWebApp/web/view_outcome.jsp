<%-- 
    Document   : view_outcome
    Created on : 27 Mar 2025, 11:05:48 PM
    Author     : nhlak
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Book> books = (List<Book>) request.getAttribute("books");
        %>
        <h1>View!</h1>
        <p>
            below is the list of all details.
        </p>
        <table>
            <th>No.</th>
            <th>Title</th>
            <th>Description</th>
            <th>ISBN</th>
            <th>ID</th>
            <th>Page</th>
            <th>Price</th>
            <th>Illustrations</th>
            <th>Creation date</th>
                <%
                    for (int x = 0; x < books.size(); x++) {
                        Book book = books.get(x);
                        String title = book.getTitle();
                        String description = book.getDescription();
                        String isbn = book.getIsbn();
                        Long id = book.getId();
                        Integer pages = book.getNoOfPages();
                        Double price = book.getPrice();
                        Date creationDate = book.getCreationDate();
                        Boolean illustrations = book.getIllustration();
                        %>
            <tr>
                <td><%=x+1%></td>
                <td><%=title%></td>
                <td><%=description%></td>
                <td><%=isbn%></td>
                <td><%=id%></td>
                <td><%=pages%></td>
                <td><%=price%></td>
                <td><%=illustrations%></td>
                <td><%=creationDate%></td>
                
            </tr>
            <%
                    }
                %>
        </table>
        <ul>
            <li><a href="menu.jsp">Menu</a></li>
            <li><a href="index.html">Home</a></li>
        </ul>
    </body>
</html>
