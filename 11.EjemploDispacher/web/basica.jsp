<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<html:form action="/seleccionar" method="get">
    <p> Numero 1: <html:text property="numero1"></html:text></p>
    <p> Numero 2: <html:text property="numero2"></html:text></p>

    <p> Operación: <html:select property="operacion">
        <html:option value="sumar_numeros">+</html:option>
        <html:option value="restar_numeros">-</html:option>
        <html:option value="multiplicar_numeros">*</html:option>
        <html:option value="dividir_numeros">/</html:option>
    </html:select></p>

    <html:submit property="submit" value="Calcular"></html:submit>
</html:form>

<% if (request.getAttribute("resultado") != null) {
    int i = (Integer) request.getAttribute("resultado");
%>
</p>
</p>
Respuesta: <%= i%>
<%}%>
<html:errors/>
</body>
</html>
