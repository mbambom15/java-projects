/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.BookFacadeLocal;
import za.ac.tut.model.entity.Book;

/**
 *
 * @author nhlak
 */
public class AddBookServlet extends HttpServlet {
    @EJB BookFacadeLocal bfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        Double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("descrption");
        String isbn = request.getParameter("isbn");
        Integer pages = Integer.parseInt(request.getParameter("pages"));
        Boolean illustrations = Boolean.parseBoolean(request.getParameter("illustrations"));
        Book book = createBook(title, price, description, isbn, pages, illustrations);
        bfl.create(book);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
    }
    private Book createBook(String title,Double price,String description,String isbn,Integer pages, Boolean illustrations){
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        book.setNoOfPages(pages);
        book.setIsbn(isbn);
        book.setIllustration(illustrations);
        book.setDescription(description);
        book.setCreationDate(new Date());
        return book;
    }

}
