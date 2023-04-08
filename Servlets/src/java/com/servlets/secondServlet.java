
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;


public class secondServlet extends GenericServlet {
    
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("This is the Servlet using Generic Servlet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is my second servlet using generic servlet</h1>");
    }

}
