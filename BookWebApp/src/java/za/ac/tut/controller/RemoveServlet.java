/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class RemoveServlet extends HttpServlet {
    @EJB BookFacadeLocal bfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        
        Book targetBook = bfl.find(id);
        
        Book book = createBook(id,targetBook);
        
        bfl.remove(book);
        RequestDispatcher disp = request.getRequestDispatcher("remove_outcome.jsp");
        disp.forward(request, response);
        
       
    }
    private Book createBook(long id, Book targetBook){
        Book book = new Book();
        book.setId(id);
        book.setTitle(targetBook.getTitle());
        return book;
    }

}
