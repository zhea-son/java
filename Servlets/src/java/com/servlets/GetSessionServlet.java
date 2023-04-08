/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetSessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        try{
            
            HttpSession session = req.getSession(false);
            String n = (String) session.getAttribute("Username");
            out.print("Hello, "+n);
        }finally{
            out.close();
        }
    }
}

