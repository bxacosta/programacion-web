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

    <table>
        <tr>
            <td>Cedula:</td>
            <td><input type="text" name="txt_cedula" size="20"/></td>
        </tr>
        <tr>
            <td>Nombre:</td>
            <td><input type="text" name="txt_nombre" size="20"/></td>
        </tr>
        <tr>
            <td>Apellido:</td>
            <td><input type="text" name="txt_apellido" size="20"/></td>
        </tr>
        <tr>
            <td>Sexo:</td>
            <td>
                <select name="sl_sexo">
                    <option value="M">M</option>
                    <option value="F">F</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <br/>
                <input type="submit" value="Ingresar datos" name="btn_ingresar"/>
            </td>
        </tr>
    </table>
</form>

<%
    if (request.getParameter("txt_cedula") != null && request.getParameter("txt_cedula") != "" &&
            request.getParameter("txt_nombre") != null && request.getParameter("txt_nombre") != "" &&
            request.getParameter("txt_apellido") != null && request.getParameter("txt_apellido") != "" &&
            request.getParameter("sl_sexo") != null && request.getParameter("sl_sexo") != "") {

        String[] datos = new String[4];
        datos[0] = request.getParameter("txt_cedula");
        datos[1] = request.getParameter("txt_nombre");
        datos[2] = request.getParameter("txt_apellido");
        datos[3] = request.getParameter("sl_sexo");
%>
<jsp:useBean id="obj" class="clases.Persona"/>
<jsp:setProperty name="obj" property="arreglo" value="<%= datos %>"/>
<%
        obj.procedimientoConexion();
        obj.procedimientoIngreso();
    }
%>
</body>
</html>
