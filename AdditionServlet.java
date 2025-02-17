/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;

/**
 *
 * @author admin
 */
public class AdditionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        ArithmeticManager am = new ArithmeticManager();
        int sum = am.add(num1, num2);
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("sum", sum); 
        
        RequestDispatcher disp = request.getRequestDispatcher("som_outcome.jsp");
        disp.forward(request, response);
    }


}
