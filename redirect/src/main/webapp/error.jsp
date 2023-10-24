<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 24.10.2023
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Błąd</title>
</head>
<body>
<h2>Wystąpił błąd</h2>
<p>Prawdopodobnie podano błędne dane logowania.</p>
<a href="<%=request.getContextPath() + "/"%>">Powrót do strony głównej</a>
</body>
</html>

