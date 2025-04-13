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
import za.ac.tut.entity.bl.Studentv1;
import za.ac.tut.entity.bl.Studentv1FacadeLocal;

/**
 *
 * @author nhlak
 */
public class AddStudentServ extends HttpServlet {
@EJB Studentv1FacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long student_number = Long.parseLong(request.getParameter("stud_num"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String qualification = request.getParameter("qualification");
        String birthdate = request.getParameter("birthdate");
        String time_entered = request.getParameter("time");
        
        //
        Studentv1 student = new Studentv1(student_number, name, surname, qualification, birthdate, time_entered);
        //
        sfl.create(student);
        
        request.setAttribute("student", student);
        request.setAttribute("message", "Added into database");
        
        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);

    }

}
