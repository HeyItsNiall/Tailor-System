<%-- 
    Document   : home
    Created on : 16 Jun 2022, 2:21:17 am
    Author     : Syamim Muaizam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

    <head>
        <title>Zarina Tailor & Alteration</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/css/new-style.css"/>
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
                    <img src="canopy2.jpg" alt="" style="width:336px;">
                </div>
            </div>
        </div>
    </div>

    <div class="container-fluid py-4 content" style="background-color:#34343c;;">
        <div class="container">
            <div class="row">
                <div class="col-12 text-center">
                    <h2 style="color:white;">LOGIN PAGE</h2></br>
                    <form action="loginProcess.jsp" method="post">
                        <div class="form-group col-6 mx-auto mb-3">
                            <label style="color:white;" class="form-label"> Username:&nbsp; </label>
                            <input type="text" name="username" class="form-control" />
                        </div>
                        <div class="form-group col-6 mx-auto">
                            <label style="color:white;" class="form-label"> Password: &nbsp; </label>
                            <input type="password" name="password" class="form-control"/><br></br>
                        </div>
                </div>
                <div class="form-group text-center">
                    &nbsp;&nbsp;&nbsp;<button style="background-color:#53B0AE;" type="submit" class="btn">Submit</button>
                    <button style="background-color:#53B0AE;" type="reset" class="btn">Reset</button>
                    <p style="color:white;" class="mt-3" style="text-align: center">Don't have an account? <a href="register.jsp" class="link">Register Here!</p>    
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