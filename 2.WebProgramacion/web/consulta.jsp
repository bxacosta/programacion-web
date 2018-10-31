<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 30/10/2018
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP, Servlets y Operaciones SQL</title>
</head>
<body>
<form method="get">
    <p> Cedula: <input type="text" name="numeroCedula" size="20"/></p>
    <p><input type="submit" value="Consultar" name="btnIngresar"/>
</form>

<% if (request.getParameter("numeroCedula") != null && request.getParameter("numeroCedula") != "") { %>
<jsp:useBean id="obj" class="clases.Persona"/>
<jsp:setProperty name="obj" property="*"/>
<%
    obj.procedimientoConexion();
    obj.procedimientoConsulta();
%>
<%= obj.procedimientoMostrarConsulta() %>
<% } %>
</body>
</html>
