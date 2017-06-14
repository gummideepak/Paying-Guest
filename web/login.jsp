<%-- 
    Document   : login
    Created on : 8 Jun, 2017, 3:11:18 PM
    Author     : sit-dt-9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="VerifyLogin" method="POST">
            User Name: <input type="text" name="username">
            Password: <input type="password" name="password">
            <input type="submit" value="Login">
        </form>
    </body>
</html>
