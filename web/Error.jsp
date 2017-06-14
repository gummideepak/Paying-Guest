<%-- 
    Document   : Error
    Created on : 12 Jun, 2017, 10:45:02 AM
    Author     : sit-dt-9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    
    <title>Material UI One Page Theme</title>
    <%
        try{
        String x = session.getAttribute("username").toString();
        session.invalidate(); 
        //out.println(x);
        }
        //Null pointer exception occurs when user is not logged in.
        catch(Exception e){
            //redirect the user to login first
            out.println("LOGIN FIRST!");
        }
    %>
    <!-- CSS  -->
    <link href="min/plugin-min.css" type="text/css" rel="stylesheet">
    <link href="min/custom-min.css" type="text/css" rel="stylesheet" >
</head>
    <body class="default_color">
    <center><h1 class="text_h">Something went wrong please try again.</h1></center>
    </body>
</html>
