<%-- 
    Document   : Student
    Created on : 2 thg 2, 2023, 22:34:46
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="StudentServlet" method="post">  
        <label>Number Of Student</label>
        <input type="number" name="number" step="1" min="0" value="${number}">
        <button type="submit">generate</button>
        </form>
    </body>
</html>
