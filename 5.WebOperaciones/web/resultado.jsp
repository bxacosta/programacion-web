<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 14/10/2018
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
    <title>Pagina de resultados</title>
</head>
<body>
<% int i = (Integer) request.getAttribute("respuesta");%>
La suma es: <%= i%>
</body>
</html>
