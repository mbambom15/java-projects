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
public class GetStatsServlet extends HttpServlet {
    @EJB IndustryFacadeLocal lfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer value = StudentViewServlet.value;
        List<Industry> indus = lfl.findAll();
        
        Integer companies = indus.size();
        Integer projects = companies * 3;
        
        
        request.setAttribute("value", value);
        request.setAttribute("companies", companies);
        request.setAttribute("projects", projects);
        
        RequestDispatcher disp = request.getRequestDispatcher("stats.jsp");
        disp.forward(request, response);
    }

}
