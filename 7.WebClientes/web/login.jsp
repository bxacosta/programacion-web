<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 17/10/2018
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Formulario de autenticacion</h1>
<html:form action="/validar" method="POST">
    <table>
        <tr>
            <td>Usuario :</td>
            <td><html:text property="usuario"></html:text></td>

        </tr>
        <tr>
            <td>Password :</td>
            <td><html:password property="password"></html:password></td>
        </tr>
        <tr>
            <td colspan="2">
                <br/>
                <html:submit property="submit" value="Validar"></html:submit>
                <html:reset value="Limpiar"/>
            </td>
        </tr>
    </table>
</html:form>
<br/>
<html:link forward="registro">Registro</html:link>
</body>
</html>
