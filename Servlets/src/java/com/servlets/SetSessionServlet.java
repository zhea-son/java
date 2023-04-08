/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SetSessionServlet extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        try{
            String n = req.getParameter("userName");
            out.print("Welcome "+n);
            HttpSession session = req.getSession();
            session.setAttribute("Username",n);
            out.print("<br/><a href='getsession'> Visit </a>");
        }finally{
            out.close();
        }
    }
}
