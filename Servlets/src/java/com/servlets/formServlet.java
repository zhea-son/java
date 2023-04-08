
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class formServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        PrintWriter out  = resp.getWriter();
        
        out.println("<h2>Welcomme to FormServlet.</h2>");
        
        String name = req.getParameter("user_name");
        String pw = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String cond = req.getParameter("condition");
        
        if(cond != null){
            if(cond.equals("checked")){
                out.println("<h3>Name: "+  name +"</h3>");
                out.println("<h3>Email: "+  email +"</h3>");
                out.println("<h3>Password: "+  pw +"</h3>");
                out.println("<h3>Gender: "+  gender +"</h3>");
                out.println("<h3>Course: "+  course +"</h3>");
                
                // saved to db
                RequestDispatcher rd = req.getRequestDispatcher("success");
                rd.forward(req, resp);
                
                
            }else{
                out.println("<h2>You have not accepted the terms and conditions</h2>");
            }
            
        }else{
            out.println("<h2>You have not accepted the terms and conditions</h2>");
            
            // Include method of RequestDispatcher
            RequestDispatcher rd = req.getRequestDispatcher("form.html");
            
            rd.include(req, resp);
        
        }
        }
    
}
