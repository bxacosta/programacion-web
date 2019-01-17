<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 17/01/2019
  Time: 0:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categorias</title>
</head>
<body>
<form action="categoria/productos.action" method="POST">
    <s:select label="Seleccione una categoria"
              headerKey="-1"
              headerValue="Seleccione"
              list="categorias"
              name="categoriaId"
              listKey="id"
              listValue="nombre"
              required="true"
    />
    <input type="submit" value="Consultar"/>
</form>

<table>
<s:iterator value="productos">
    <tr>
        <td><s:property value="productoId"/></td>
        <td><s:property value="productoNombre"/></td>
        <td><s:property value="productoStock"/></td>
        <td><s:property value="productoPrecio"/></td>
    </tr>
</s:iterator>
</table>

</body>
</html>
