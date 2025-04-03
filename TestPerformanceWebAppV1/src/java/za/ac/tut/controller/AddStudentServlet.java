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
public class AddStudentServlet extends HttpServlet {
    @EJB StudentFacadeLocal pfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Double percMarkObtained = Double.parseDouble(request.getParameter("percMarkObtained"));
       
        Student student = createStudent(id, name, surname, gender,age, percMarkObtained);
        pfl.create(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_student_outcome.jsp");
        disp.forward(request, response);
    }
    private Student createStudent(Long id, String name, String surname, String gender, Integer age, Double percMarkObtained){
        Student student = new Student();
        student.setId(id);
        student.setFirstName(name);
        student.setLastName(surname);
        student.setGender(gender);
        student.setAge(age);
        student.setPercMarkObtained(percMarkObtained);
        return student;
    }

}
