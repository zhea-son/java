<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Form Processing Example</title>
    </head>
    <body>
        <h1>Form Processing Example</h1>

        <%-- process the form data when it is submitted --%>
        <%
            if (request.getMethod().equalsIgnoreCase("POST")) {
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String message = request.getParameter("message");

                // validate the form data
                if (name == null || name.trim().equals("") || email == null || email.trim().equals("") || message == null || message.trim().equals("")) {
                    out.println("<p>Please fill in all fields.</p>");
                } else {
                    // save the form data to a database or other storage mechanism
                    out.println("<p>Thank you for submitting the form!</p>");
                }
            }
        %>

        <%-- display the form to the user --%>
        <form action="${pageContext.request.contextPath}/processForm.jsp" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name"><br>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email"><br>
            <label for="message">Message:</label>
            <textarea id="message" name="message"></textarea><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>



