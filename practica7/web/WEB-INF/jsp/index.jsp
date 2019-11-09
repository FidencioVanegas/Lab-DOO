<%-- 
    Document   : index.jsp
    Created on : 25/10/2019, 12:33:11 PM
    Author     : Metal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>
    <body>
        <form action="Login" method="POST" >
            <center>
                <h1>Login</h1>
                <p>Usuario</p><p> <input type="text" name="usuario"/></p>
                <p>Contraseña</p><p> <input type="password" name="contra" /></p>
                <p><input type="submit" value="Enivar"/></p>
            </center>
        </form>
    </body>
</html>
