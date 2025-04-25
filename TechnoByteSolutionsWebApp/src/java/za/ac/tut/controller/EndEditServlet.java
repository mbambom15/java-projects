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
public class EndEditServlet extends HttpServlet {
    
    @EJB
    IndustryFacadeLocal lfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String t1 = request.getParameter("t1");
        String d1 = request.getParameter("d1");
        
        String t2 = request.getParameter("t2");
        String d2 = request.getParameter("d2");
        
        String t3 = request.getParameter("t3");
        String d3 = request.getParameter("d3");
        
        Industry industry = lfl.find(id);
        
        industry.setTitle1(t1);
        industry.setDesc1(d1);
        industry.setTitle2(t2);
        industry.setDesc2(d2);
        industry.setTitle3(t3);
        industry.setDesc3(d3);
        lfl.edit(industry);
        
        RequestDispatcher disp = request.getRequestDispatcher("edit_outcome.jsp");
        disp.forward(request, response);
        
    }
    
}
