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
public class EditStudentServ extends HttpServlet {
    @EJB Studentv1FacadeLocal sfl;

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long std_num = Long.parseLong(request.getParameter("std_num"));
        String new_qualification = request.getParameter("quaili");
        
        Studentv1 student = sfl.find(std_num);
        String old = student.getQualification();
        
        student.setQualification(new_qualification);
        sfl.edit(student);
        
        request.setAttribute("old", old);
        request.setAttribute("student", student);
        request.setAttribute("std_num", std_num);
        
        RequestDispatcher disp = request.getRequestDispatcher("edit_outcome.jsp");
        disp.forward(request, response);
        
    }

    

}
