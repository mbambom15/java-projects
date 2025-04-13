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
public class DeleteStudentServ extends HttpServlet {
    @EJB Studentv1FacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long student_number = Long.parseLong(request.getParameter("std_num"));
        
        Studentv1 student = sfl.find(student_number);
        
        sfl.remove(student);
        Boolean remove= false;
        Studentv1 student2 = sfl.find(student_number);
        
        if(student2 == null){
            remove = true;
        }
        
        request.setAttribute("remove", remove);
        
        RequestDispatcher disp = request.getRequestDispatcher("delete_outcome.jsp");
        disp.forward(request, response);

    }

}
