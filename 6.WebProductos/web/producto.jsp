<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 03/10/2018
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ page import="java.util.*,controladores_form.*" %>

<html>
<head>
    <title>Consulta solicitada...</title>
</head>
<body>
<% ArrayList<ProductosBean> productos = (ArrayList) request.getAttribute("productos");%>
<h1>Listado de productos</h1>
<table border="1" width="60%">
    <th>Categoria_Id</th>
    <th>Categoria</th>
    <th>Producto_Id</th>
    <th>Producto</th>
    <th>Precio</th>
    <th>Stock</th>
    <% for (int i = 0; i < productos.size(); i++) { %>
    <% ProductosBean prod = productos.get(i); %>
    <tr>
        <td><%= prod.getCategoriaId()%>
        </td>
        <td><%= prod.getCategoriaNombre()%>
        </td>
        <td><%= prod.getProductoId()%>
        </td>
        <td><%= prod.getProductoNombre()%>
        </td>
        <td><%= prod.getProductoPrecio()%>
        </td>
        <td><%= prod.getProductoStock()%>
        </td>
    </tr>
    <% } %>

</table>

</body>
</html>
