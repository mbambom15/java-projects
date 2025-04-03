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
import za.ac.tut.entities.StudentFacade;
import za.ac.tut.entities.StudentFacadeLocal;

/**
 *
 * @author nhlak
 */
public class GetStudentNameSurnameServ extends HttpServlet {
    @EJB StudentFacadeLocal pfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Student student = pfl.find(name,surname);
        request.setAttribute("student", student);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_stud_namesurname_outcome.jsp");
        disp.forward(request, response);
        
      
    }
}
