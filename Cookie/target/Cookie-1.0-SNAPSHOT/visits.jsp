<%--
  Created by IntelliJ IDEA.
  User: goral
  Date: 14.10.2023
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wizyty</title>
</head>
<body>
<h1>Cześć!</h1>
<h2>Twoja liczba odwiedzin na naszej stronie: <%= request.getAttribute("numberOfVisits")%></h2>
<a href="remove">Wyzeruj licznik</a>
</body>
</html>
