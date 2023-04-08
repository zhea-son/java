

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@page import="java.util.*,java.text.*,java.io.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Implicit Objects</title>
    </head>
    <body>
        <h1>Example of use of Implicit Objects:</h1>

        <%
            
            // Request object
            
            out.println("Request parameter 1: " + request.getParameter("param1") + "<br>");
            

            // Response object
            response.setContentType("text/html");
            out.println("This is the response body :<b>"+response.getWriter()+ "</b><br>");

            // Session object
            out.println("Session ID: " + session.getId() + "<br>");

            // Application object
            
            out.println("Application name: " + application.getServletContextName() + "<br>");

            // Config object
            
            out.println("Servlet name: " + config.getServletName() + "<br>");

            // PageContext object
            
            out.println("Page language: " + JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true) + "<br>");

            // Exception object
            try {
                int i = 1 / 0; // Causes an exception
            } catch (Exception e) {
                out.println("Exception: " + e.getMessage() + "<br>");
            }

        %>
    </body>
</html>
