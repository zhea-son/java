
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class thirdServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is get method of HTTP Servlet....");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.println("<h1>This is get method of Third Servlet</h1>");
    }
    
    
}
