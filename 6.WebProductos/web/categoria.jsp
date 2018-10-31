<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 03/10/2018
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<html>
<head>
    <title>JSP Page</title>
</head>
<body>

<h1>Listado de los codigos de cateria</h1>
<html:form action="/listado" method="post">

    <html:select property="codigoCategoria">
        <html:options name="categoriaForm" property="codigoCategoria"/>
    </html:select>

    <html:submit value="Mostrar Listado de Productos"/>

</html:form>

</body>
</html>
