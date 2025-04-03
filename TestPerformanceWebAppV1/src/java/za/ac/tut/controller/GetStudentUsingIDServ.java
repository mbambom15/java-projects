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
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentFacadeLocal;

/**
 *
 * @author nhlak
 */
public class GetStudentUsingIDServ extends HttpServlet {
    @EJB StudentFacadeLocal gsl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        Long id = Long.parseLong(request.getParameter("id"));
        
        Student student = gsl.find(id);
        request.setAttribute("student", student);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_stud_id_outcome.jsp");
        disp.forward(request, response);
    }
}
