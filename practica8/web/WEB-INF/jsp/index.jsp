<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>

    <body>
        <form action="session" method="POST" >
            <center>
                <h1>Login</h1>
                <p>Usuario</p><p> <input type="text" name="usuario"/></p>
                <p>Contraseña</p><p> <input type="password" name="contra" /></p>
                <p><input type="submit" value="Enivar"/></p>
                
            </center>
        </form>
        <center>
        <p>para registrarte has clic <a href="formusuario.htm" >aqui</a></p>
        </center>
    </body>
</html>
