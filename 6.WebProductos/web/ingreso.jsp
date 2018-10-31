<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 03/10/2018
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
    <title>Formulario de bienvenida</title>
</head>
<body>
<html:form action="/ingresar" method="post">

    <h1>Bienvenidos al sistema de consulta</h1>

    <html:submit property="submit" value="Ingresar al sestema"/>

</html:form>
</body>
</html>
