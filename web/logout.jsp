<%-- 
    Document   : logout
    Created on : 12 Jun, 2017, 9:47:13 AM
    Author     : sit-dt-9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String x=null;%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    
    <title>Material UI One Page Theme</title>
    <%
        try{
        x = session.getAttribute("username").toString();
        session.invalidate(); 
        //out.println(x);
        //if user didnt login a null pointer exception will be thrown
        }
        catch(Exception e){
            //catch that exception and redirect the user to a error page.
            
            response.sendRedirect("http://localhost:8084/Paying_Guest/Error.jsp");
        }
    %>
    
    <!-- CSS  -->
    <link href="min/plugin-min.css" type="text/css" rel="stylesheet">
    <link href="min/custom-min.css" type="text/css" rel="stylesheet" >
</head>
    <body class="default_color">
    <center><h1 class="text_h"><%out.println(x);%> logged Out.</h1></center>
    </body>
</html>
