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
public class FindBookServlet extends HttpServlet {

    @EJB BookFacadeLocal bfl; 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong("id");
        
        Book book = bfl.find(id);
        request.setAttribute("book", book);
        
        RequestDispatcher disp = request.getRequestDispatcher("find_outcome.jsp");
        disp.forward(request, response);
        
       
    }

   

}
