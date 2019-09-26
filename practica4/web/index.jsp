<%-- 
    Document   : index
    Created on : 20/09/2019, 07:09:02 PM
    Author     : FCFM_5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 4</title>
    </head>
    <body>
        <form action="Formulario.jsp" method="post">
            <p>
                Nombre(s):  <input type="text" name="Nombre">
                <br>
                Apellido Paterno:   <input type="text" name="ApellidoP">
                <br>
                Apellido Materno:   <input type="text" name="ApellidoM">
                <br>
                Correo Electronico: <input type="text" name="correo">
                <br>
                Contraseña: <input type="password" name="contra">
                <br>
                Fecha de Nacimiento:    <input type="date" name="FechaDN">
                <br>
                <input type="submit" value="Enviar"></p>
            </p>
        </form>
    </body>
</html>
