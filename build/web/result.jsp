<%-- 
    Document   : result
    Created on : 2 thg 2, 2023, 22:56:55
    Author     : nguye
--%>

<%@page import="model.Student"%>
<%@page import="model.StudentList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Student.jsp" %>
       <% StudentList st = (StudentList)request.getAttribute("stulist"); %>
        <form action ="StudentServlet" method = "post">
            <table>
               <table border="1">
                
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Gender</td>
                    <td>Date of Birthday </td>      
                </tr>
                
               <% for(int i = 0; i < st.size(); i++) { %>
                       
                <tr>
                    
                    <td> <%= st.get(i).getId()%>  </td>
                    <td> <%= st.get(i).getName()%></td>
                    <td> <%= st.get(i).getGender()%></td>
                    <td> <%= st.get(i).getDate()%></td>
                </tr>
                    <%}%>

            </table>
        </form> 
        
    </body>
</html>
