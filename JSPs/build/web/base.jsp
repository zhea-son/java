

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Base Page</title>
    </head>
    <body>
    <%
        Cookie first = new Cookie("Firstname", request.getParameter("fname"));
        Cookie last = new Cookie("Lastname", request.getParameter("lname"));
    
        response.addCookie( first );
        response.addCookie( last );
        
        session.setAttribute("user",request.getParameter("fname"));
    %>
    <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("fname")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("lname")%>
         </p></li>
      </ul>
    <a href="show.jsp"> Get Session and Cookies values </a>
    </body>
</html>
