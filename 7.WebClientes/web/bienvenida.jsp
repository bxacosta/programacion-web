<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 17/10/2018
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<html>
<head>
    <title>Bienbenida</title>
</head>
<body>
<h1>
    <h1>Bienvenido a mi pagina
        <i>
            <bean:write name="ValidacionForm" property="usuario"/>
        </i>
    </h1>
</h1>
</body>
</html>
