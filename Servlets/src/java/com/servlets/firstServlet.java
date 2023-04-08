
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class firstServlet implements Servlet{
    
    ServletConfig conf;
    
    //override lifecycle
    
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating Object......");
    }
    
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("Servicing.......");
        //set the content type of response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>this is the output from servlet method:</h1>");        
        out.println("<h1>Today's date and time is:"+new Date().toString()+"</h1>");

        
    }
    
    public void destroy(){
        System.out.println("Going to destroy servlet object");
    }
    
    //override non-lifecycle methods
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo(){
        return "This servlet is created by Ranjan Khana";
    }
    
}
