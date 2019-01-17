<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 16/01/2019
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Fromulario de autenticacion</h1>
<form action="paquete1/login.action" method="post">
    <table>
        <tr>
            <td>Usuario</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password"/></td>
        </tr>
        <tr>
            <td align="center" colspan="2"><input type="submit" value="Entrar"/></td>
        </tr>
    </table>
</form>
</body>
</html>
