<%-- 
    Document   : processForm
    Created on : Feb 20, 2023, 12:49:21 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Data</title>
    </head>
    <body>
        <h1>Display:</h1>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String message = request.getParameter("message");

        %>
        
        <h2>Name: <%= name %></h2>
        <h2>Email: <%= email %></h2>
        <h2>Message: <%= message %></h2>
    </body>
</html>
