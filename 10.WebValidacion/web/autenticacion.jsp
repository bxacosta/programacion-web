<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 28/11/2018
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validar</title>
</head>
<body>
<h1>Formulario de autenticacion</h1>
<html:javascript formName="ValidacionForm"/>
<html:form action="/validar" method="post" onsubmit="return validateValidacionForm(this);">
    <table>
        <tr>
            <td> Usuario:</td>
            <td><html:text property="usuario"/></td>
        </tr>
        <tr>
            <td> Password:</td>
            <td><html:text property="password"/></td>
        </tr>
        <tr>
            <td><html:submit property="submit" value="Validar"/>
                <html:reset value="Limpiar"/></td>
        </tr>
    </table>
</html:form>
</body>
</html>
