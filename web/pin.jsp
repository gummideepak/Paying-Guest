<%-- 
    Document   : pin
    Created on : 10 Jun, 2017, 9:49:26 AM
    Author     : sit-dt-9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function check(){
            var pin = '<%= session.getAttribute("pin") %>';
            var input = document.getElementById("pin").value;
    </head>
    <body>
      
        <h1>Hello World!</h1>
    </body>
</html>
