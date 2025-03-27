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
public class ModifyBookServlet extends HttpServlet {
@EJB BookFacadeLocal bfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Double price = Double.parseDouble(request.getParameter("price"));
        Long id = Long.parseLong(request.getParameter("id"));
        
        Book book = createBook(id, price);
        bfl.edit(book);
        
        RequestDispatcher disp = request.getRequestDispatcher("modify_outcome.jsp");
        disp.forward(request, response);

    }
    private Book createBook(Long id, Double price){
        Book book = new Book();
        book.setId(id);
        book.setPrice(price);
        return book;
    }

}
