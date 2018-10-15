<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 14/10/2018
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="idBean" class="clases.BeanOperacion" />
<jsp:setProperty name="idBean" property="*" />

<html>
  <head>
    <title>JSO Utilizando una Clase Java</title>
  </head>
  <body>

  <form method="get">
    <p>Numero 1: <input type="text" name="numero1" size="20"></p>
    <p>Numero 2: <input type="text" name="numero2" size="20"></p>
    <input type="submit" value="Sumar" name="btnSumar">
  </form>

  <p>La suma de <%= idBean.getNumero1()%> + <%= idBean.getNumero2()%> es: <%= idBean.suma()%></p>
  </body>
</html>
