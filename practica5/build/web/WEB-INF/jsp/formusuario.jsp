<%-- 
    Document   : formusuario
    Created on : 3/10/2019, 10:05:06 PM
    Author     : Metal
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        
        <form:form>
            <p>
                <form:label path="nombre">Nombre</form:label>
                <form:input path="nombre" />
            </p>
            <p>
                <form:label path="correo">Correo</form:label>
                <form:input path="correo" />
            </p>
            <p>    
                <form:label path="contra">Contraseña</form:label>
                <form:input path="contra" />
            </p>
            <p>
                <form:label path="fecha">Fecha de nacimiento</form:label>
                <form:input path="fecha" />
            </p>
            <p>
                <form:button>Enviar</form:button>
            </p>
        </form:form>
    </body>
</html>
