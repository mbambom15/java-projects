/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class QualificationSearchServlet extends HttpServlet {
@EJB Studentv1FacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String qualification = request.getParameter("qualification");
        //
        List<Studentv1> students = new ArrayList<>();
        
        students = sfl.findByQualififcation(qualification);
        Boolean isFound = false;
        
        if(students != null){
            isFound = true;
            request.setAttribute("students", students);
            request.setAttribute("isFound", isFound);
            request.setAttribute("qualification", qualification);
            
            
            RequestDispatcher disp = request.getRequestDispatcher("outcome_quali.jsp");
            disp.forward(request, response);
        }else{
            request.setAttribute("isFound", isFound);
            request.setAttribute("qualification", qualification);
            RequestDispatcher disp = request.getRequestDispatcher("outcome_quali.jsp");
            disp.forward(request, response);
        }
        
    }
}
