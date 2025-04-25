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
import za.ac.tut.entity.Industry;
import za.ac.tut.entity.bl.IndustryFacadeLocal;

/**
 *
 * @author nhlak
 */
public class StartEditServlet extends HttpServlet {
@EJB IndustryFacadeLocal lfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        Industry industry = lfl.find(id);
        
        request.setAttribute("id", id);
        request.setAttribute("industry", industry);
        
        RequestDispatcher disp = request.getRequestDispatcher("edit.jsp");
        disp.forward(request, response);
        
        
    }

    

}
