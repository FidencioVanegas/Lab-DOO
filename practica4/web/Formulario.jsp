<%-- 
    Document   : Formulario
    Created on : 20/09/2019, 07:25:10 PM
    Author     : FCFM_5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <p>Nombre:
            <% out.print(request.getParameter("Nombre")+" "+request.getParameter("ApellidoP")+" "+ request.getParameter("ApellidoM")); %>
        </p>
        <p>Correo Electronico:
            <% out.print(request.getParameter("correo")); %>
        </p>
        <p>Contraseña: 
            <% out.print(request.getParameter("contra")); %>
        </p>
        <p>Fecha de nacimiento: 
            <% out.print(request.getParameter("FechaDN")); %>
        </p>
    </body>
</html>
