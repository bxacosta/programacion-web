<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 14/10/2018
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
    <title>Formulario de ingreso de datos</title>
</head>
<body>
<html:form action="/validar" method="POST">
    <p> Número 1: <html:text property="numero1" value=""></html:text></p>
    <p> Número 2: <html:text property="numero2" value=""></html:text></p>
    <html:submit property="submit" value="Sumar"> </html:submit>
</html:form>
</body>
</html>
