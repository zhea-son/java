<%-- 
    Document   : second
    Created on : Feb 19, 2023, 11:58:33 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.Random,java.util.ArrayList,java.io.*" %>

<%@page isErrorPage="false" %>

<%@page session="false" %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>Random Number: 
            <%
                Random r = new Random();
                int n= r.nextInt(12);
                out.println(n);
            
            %>
        
        </h1>
    </body>
</html>
