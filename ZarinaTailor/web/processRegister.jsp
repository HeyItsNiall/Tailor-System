<%-- 
    Document   : processRegister
    Created on : 3 Jun 2022, 2:18:27 pm
    Author     : Ahmad Dannial Dzulkarnain 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zarina Tailor & Alteration</title>
    </head>
    <body>
        <%
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
            Statement st=conn.createStatement();
            
            int i = st.executeUpdate("insert into users(firstname, lastname, email, userid, password) values('"+fname+"', '"+lname+"', '"+email+"', '"+userid+"', '"+password+"')");
            out.println("Thank you for register ! Please <a href='login.jsp'>Login</a> to continue. ");
            
        } catch(Exception e)
        {
            System.out.print(e);
            e.printStackTrace();
        }
        %>
    </body>
</html>
