<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 24.10.2023
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Panel administracyjny</title>
</head>
<body>
<h1>Cześć <%=request.getSession().getAttribute("username")%></h1>
<p>To jest centrum sterowania światem. Możesz tutaj:</p>
<ul>
    <li>Zarządzać użytkownikami</li>
    <li>Moderować treści dodawane przez innych</li>
    <li>Analizować statystyki strony</li>
    <li>i wiele więcej</li>
</ul>
</body>
</html>