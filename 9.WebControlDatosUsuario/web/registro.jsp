<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 28/11/2018
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro</title>
</head>
<body>
<html:javascript formName="RegistroForm"/>
<html:form action="/registrar.do" method="post" onsubmit="return validateRegistroForm(this);">
    <table>
        <tr>
            <td>Nombre:</td>
            <td><html:text property="nombre"/></td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Apellido:</td>
            <td><html:text property="apellido"/></td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Usuario:</td>
            <td><html:text property="usuario"/></td>

        </tr>
        <tr>
            <td>Password:</td>
            <td><html:text property="password"/></td>

        </tr>

        <tr>
            <td>Email:</td>
            <td><html:text property="email"/></td>

        </tr>
        <tr>
            <td colspan="3">
                <br/>
                <html:submit property="sumbit" value="Registrar"/>
                &nbsp;&nbsp;
                <html:reset value="Limpiar"/>
            </td>
        </tr>
    </table>
</html:form>
</body>
</html>
