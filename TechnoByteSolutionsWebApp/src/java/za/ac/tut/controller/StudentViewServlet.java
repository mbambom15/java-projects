/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class StudentViewServlet extends HttpServlet {
    @EJB IndustryFacadeLocal lfl;
    
static int value =0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String selectedBtn = request.getParameter("param");
        if("GET".equals(selectedBtn)){
            value++;
        }
       
        List<Industry> industry = lfl.findAll();
        
        request.setAttribute("industry", industry);
        
        RequestDispatcher disp = request.getRequestDispatcher("view.jsp");
        disp.forward(request, response);
        
    }

}
