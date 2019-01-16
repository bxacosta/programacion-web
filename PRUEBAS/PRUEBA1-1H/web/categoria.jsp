<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 31/10/2018
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<html>
<head>
    <title>$Title$</title>

    <script type="text/javascript">
        function select(form) {
            form.submit();
        }
    </script>
</head>
<body>
<html:form action="/listado" method="post">
    <p>Categoria: </p>
    <html:select property="codigoProducto" onchange="select(this.form);">
        <html:options name="categoriaForm" property="codigoProducto"/>
    </html:select>
</html:form>
</body>
</html>
