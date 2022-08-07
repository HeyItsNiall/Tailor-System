<%-- 
    Document   : home
    Created on : 16 Jun 2022, 2:21:17 am
    Author     : Syamim Muaizam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>Zarina Tailor & Alteration</title>
</head>
  
<body>

    <div class="container-fluid py-1" style="background-color: #53B0AE;;">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <br>
                    <h1 font size = "+2" class="text-center" style="color:white;">ZARINA TAILOR & ALTERATION</h1>
                </div>
            </div>
                <div class="col-5 offset-1">
                   
                </div>
            </div>
        </div>
    </div>

    <div class="container-fluid py-4" style="background-color:#B3D8D2;;">
        <div class="container">
            <div class="row">
                <div class="col-12 text-center">
                    <h2 style="color:white;"></h2></br>
                    <form action="processRegister.jsp" method="post">
   
    </style>
                    <div class="form-group">
      
              
                        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zarina Tailor & Alteration</title>
    </head>
  
        <%
        String userid = request.getParameter("username");
        session.setAttribute("userid", userid);
        
        String password = request.getParameter("password");
        
        Class.forName("com.mysql.jdbc.Driver");
        
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "admin");
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(" select * from users where userid = '"+userid+"' and password='"+password+"' ");
        
        
        try{
        
            if(rs.next())
                
                {
                
                    out.println("Welcome " +userid +"<br></br>");
                    out.println("You have been successfully login! <a href='main.html'>Go to Main Page</a>. ");
                
                }
                
                else {
                    out.println("<body bgcolor='white'>Invalid password or username!");
                }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        %>
                    
                        
                    </div>
                    <br>
                    
                    </div>
                       
                    </div>
                    
                    
                        
                         
                    </div>
            
            </div>
            
        </div>
    </div>
    
    

            


    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>
    -->
</body>

</html>
<div class="container-fluid py-1" style="background-color: #53B0AE;">
<div class="text-center">
    <h6 style="color:white;">Copyright@ZarinaTailor</h6>