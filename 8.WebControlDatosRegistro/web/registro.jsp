<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 21/11/2018
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<html:form action="/registrar" method="post">
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
        <td>&<html:errors property="usuario"/></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><html:text property="password"/></td>
        <td>&<html:errors property="password"/></td>
    </tr>

    <tr>
        <td>Password:</td>
        <td><html:text property="passwordRep"/></td>
        <td>&<html:errors property="passwordrep"/></td>
    </tr>
    <tr>
        <td>Email:</td>
        <td><html:text property="email"/></td>
        <td>&<html:errors property="email"/></td>
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

<% if (request.getAttribute("message") != null) {
    String s = (String) request.getAttribute("mensaje");%>
<p> <%=s%>
            <%}%>

    </html:form>
</body>
</html>
