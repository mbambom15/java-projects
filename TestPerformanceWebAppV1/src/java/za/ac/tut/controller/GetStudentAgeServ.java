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
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentFacadeLocal;

/**
 *
 * @author nhlak
 */
public class GetStudentAgeServ extends HttpServlet {
    @EJB StudentFacadeLocal pfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer minAge = Integer.parseInt(request.getParameter("minAge"));
        Integer maxAge = Integer.parseInt(request.getParameter("maxAge"));
        
        List<Student> list = pfl.findStudentsWithinAgeRange(minAge, maxAge);
        request.setAttribute("list", list);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_stud_age_outcome.jsp");
        disp.forward(request, response);
        
    }
}
