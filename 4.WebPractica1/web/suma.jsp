<%--
  Created by IntelliJ IDEA.
  User: xavier
  Date: 14/10/2018
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="idBean" class="clases.BeanOperacion"/>
<jsp:setProperty name="idBean" property="*"/>

<html>
<head>
    <title>Practica de JSP usando javascript</title>

    <script>
        function calcular(signo) {
            switch (signo) {
                case '+':
                    document.form1.resultado.value = eval(document.form1.Numero1.value) + eval(document.form1.Numero2.value);
                    break;
                case '-':
                    document.form1.resultado.value = eval(document.form1.Numero1.value) - eval(document.form1.Numero2.value);
                    break;
                case '*':
                    document.form1.resultado.value = eval(document.form1.Numero1.value) * eval(document.form1.Numero2.value);
                    break;
                case '/':
                    document.form1.resultado.value = eval(document.form1.Numero1.value) / eval(document.form1.Numero2.value);
                    break;
                default:
                    document.form1.resultado.value = "ERROR";
                    break;
            }
        }
    </script>
</head>
<body>
<form name="form1">
    <p> Numero 1: <input type="text" name="Numero1" size="5"/></p>
    <p>
        <select name="signo">
            <option value="+"> +</option>
            <option value="-"> -</option>
            <option value="*"> *</option>
            <option value="/"> /</option>
        </select>
    </p>
    <p> Numero 2: <input type="text" name="Numero2" size="5"/></p>

    <input type="button" value="Calcular" name="btnIngresar" onclick="calcular(signo.value)"/>

    <p>Resultado: <input type="text" name="resultado" size="5"/></p>
</form>
</body>
</html>
