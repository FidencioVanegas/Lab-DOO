<%-- 
    Document   : resultado
    Created on : 3/10/2019, 10:42:02 PM
    Author     : Metal
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        nombre: <c:out value="${nombre}" />
        <br>
        correo: <c:out value="${correo}" />
        <br>
        contraseña: <c:out value="${contra}" />
        <br>
        fecha de nacimiento: <c:out value="${fecha}" />
    </body>
</html>
