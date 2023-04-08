<%-- 
    Document   : first
    Created on : Feb 19, 2023, 10:36:09 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>First JSP Page</h1><br>
        <h2>Tags in JSP</h2>
        
        <!-- Declaration Tag -->
        <%!
            int a = 50;
            int b = 10;
            String name = "JAVA";

            public int sum() {
                return a + b;
            }

            public String reverse() {
                StringBuffer br = new StringBuffer(name);
                return br.reverse().toString();
            }
        %>
        
        Sum : <% out.println(sum()); %> <!-- Scriplet Tag -->
        Name : <%= reverse() %><!-- Expression Tag -->
    </body>
</html>
