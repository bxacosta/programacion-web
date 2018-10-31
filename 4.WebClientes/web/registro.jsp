<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 17/10/2018
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<html>
<head>
    <title>Registrarse</title>
</head>
<body>

<h1>Registro de usuarios</h1>
<html:form action="/registrar" method="post">
    <table>
        <tr>
            <td>Nombre:</td>
            <td><html:text property="nombre"></html:text></td>
        </tr>
        <tr>
            <td>Apellidos:</td>
            <td><html:text property="apellido"></html:text></td>
        </tr>
        <tr>
            <td>Usuario:</td>
            <td><html:text property="usuario"></html:text></td>
        </tr>
        <tr>
            <td>Password :</td>
            <td><html:text property="password"></html:text></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><html:text property="email"></html:text></td>
        </tr>
        <tr>
            <td colspan="2">
                <br/>
                <html:submit property="submit" value="Registrar"></html:submit>
                <html:reset value="Limpiar"/>
            </td>
        </tr>
    </table>
</html:form>
</body>
</html>
