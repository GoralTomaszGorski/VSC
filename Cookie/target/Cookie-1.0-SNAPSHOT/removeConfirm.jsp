<%--
  Created by IntelliJ IDEA.
  User: goral
  Date: 15.10.2023
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wizyty</title>
</head>
<body>
<h1>Cześć!</h1>
<h2>Twoja liczba odwiedzin na naszej storonie: <%= request.getAttribute("numberOfVisits") %> </h2>

<a href="counter">wroć do licznikak</a>

</body>
</html>
