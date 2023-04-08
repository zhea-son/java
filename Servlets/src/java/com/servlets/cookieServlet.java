/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Asus
 */

public class cookieServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String data = request.getParameter("fname");
            String data1 = request.getParameter("lname");
            
            Cookie cookie = new Cookie("f",data);
            Cookie cookie1 = new Cookie("n",data1);
            
            response.addCookie(cookie);
            response.addCookie(cookie1);
            /* TODO output your page here. You may use following sample code. */
            
            ;
            out.println("<h1>Cookie has been set to:</h1>");
            out.println(data);
            out.println("<br/>");
            out.println(data1);
           
            out.println("<br/>");
            out.println("<form action='getcookie' method='POST'>");
            out.println("<input type='submit' value='Get Cookies'>");
            out.println("</form");
        }
        finally{
            out.close();
        }
    }
}
