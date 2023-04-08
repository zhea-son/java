<%-- 
    Document   : show
    Created on : Mar 27, 2023, 12:17:43 PM
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
        <%   
            out.println("Output of Session");
            String name=(String)session.getAttribute("user");  
            out.println("Hello "+name);  
  
            Cookie cookie = null;
            Cookie[] cookies = null;
            cookies = request.getCookies();
            
            
%>
<h1>Output of Cookies</h1>
Welcome:<%
    out.print(cookies[1].getValue()+" " + cookies[2].getValue());
%>
    </body>
</html>
