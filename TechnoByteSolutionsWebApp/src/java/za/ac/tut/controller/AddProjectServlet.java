/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entity.Faculty;
import za.ac.tut.entity.Industry;
import za.ac.tut.entity.bl.FacultyFacadeLocal;

/**
 *
 * @author nhlak
 */
public class AddProjectServlet extends HttpServlet {

    @EJB
    FacultyFacadeLocal ffl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String compName = request.getParameter("name");

        String t1 = request.getParameter("t1");
        String d1 = request.getParameter("d1");

        String t2 = request.getParameter("t2");
        String d2 = request.getParameter("d2");

        String t3 = request.getParameter("t3");
        String d3 = request.getParameter("d3");

        Date time = new Date();
        //
        Industry industry = new Industry(id, compName, t1, d1, t2, d2, t3, d3, time);

        List<Industry> industries = new ArrayList<>();
        industries.add(industry);

        Faculty faculty = new Faculty(industries);

        ffl.create(faculty);

        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
    }
}
