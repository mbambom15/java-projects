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
public class GetTestStatsServlet extends HttpServlet {
    @EJB StudentFacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> list = sfl.findAll();
        Integer cnt = sfl.count();
        Double lowestMark = sfl.getLowestMark();
        Double highestMark = sfl.getHighestMark();
        Double avgMark = sfl.getAverageMark();
        Integer cntPassed = sfl.cntAllPassedStudents();
        Integer cntFailed = sfl.cntAllFailedStudents();
        Integer numMales = sfl.cntAllMaleStudents();
        Integer numFemales = sfl.cntAllFemaleStudents();
        Integer numMalesPassed = sfl.cntAllPassedMaleStudents();
        Integer numFemalesPassed = sfl.cntAllPassedFemaleStudents();
        Integer numMalesFailed = sfl.cntAllFailedFemaleStudents();
        Integer numFemalesFailed = sfl.cntAllFailedFemaleStudents();
        
        request.setAttribute("list", list);
        request.setAttribute("cnt", cnt);
        request.setAttribute("lowestMark", lowestMark);
        request.setAttribute("highestMark",highestMark);
        request.setAttribute("avgMark", avgMark);
        request.setAttribute("cntPassed", cntPassed);
        request.setAttribute("cntFailed", cntFailed);
        request.setAttribute("numMales", numMales);
        request.setAttribute("numFemales", numFemales);
        request.setAttribute("numMalesPassed", numMalesPassed);
        request.setAttribute("numFemalesPassed", numFemalesPassed);
        request.setAttribute("numMalesFailed", numMalesFailed);
        request.setAttribute("numFemalesFailed", numFemalesFailed);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_test_stats_outcome.jsp");
        disp.forward(request, response);

    }

}
