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
public class SearchStudentServ extends HttpServlet {
    @EJB Studentv1FacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long studentNo = Long.parseLong(request.getParameter("stud_num"));
        
        Studentv1 stud = sfl.find(studentNo);
        
       Boolean found = false;
       if(stud != null){
           found = true;
           request.setAttribute("stud", stud);
           request.setAttribute("found", found);
           
           RequestDispatcher disp = request.getRequestDispatcher("search_outcome.jsp");
           disp.forward(request, response);
       }else{
           request.setAttribute("stud", stud);
           request.setAttribute("found", found);
           
           RequestDispatcher disp = request.getRequestDispatcher("search_outcome.jsp");
           disp.forward(request, response);
       }

    }

}
