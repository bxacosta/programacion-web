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
        <td>Cedula:</td>
        <td><html:text property="cedula"/></td>
        <td>&<html:errors property="cedula"/></td>
    </tr>
    <tr>
        <td>Nombre:</td>
        <td><html:text property="nombre"/></td>
        <td>&<html:errors property="nombre"/></td>
    </tr>
    <tr>
        <td>Apellido:</td>
        <td><html:text property="apellido"/></td>
        <td>&<html:errors property="nombre"/></td>
    </tr>
    <tr>
        <td>Calificacion:</td>
        <td><html:text property="calificacion"/></td>
        <td>&<html:errors property="calificacion"/></td>
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
    String s = (String) request.getAttribute("message");%>
<p> <%=s%>
            <%}%>

    </html:form>
</body>
</html>
