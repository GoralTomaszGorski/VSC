<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 28.10.2023
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression Language</title>
</head>
<body>
<form action=""method="post">
    <fieldset>
        <div>
            <label for="firstName">Imię</label>
            <input name="firstName" id="firstName">
        </div>
        <div>
            <label for="lastName">Nazwisko</label>
            <input name="lastName" id="lastName">
        </div>
        <div>
            <label for="age">Wiek</label>
            <input name="age" type="number" id="age">
        </div>
    </fieldset>
    <input type="submit" value="Wyślij">
</form>
<%
    if (request.getAttribute("person") != null){
        %>
        <h2> Cześć ${person.firstName}</h2>
                <p style="color:${person.age ge 18 ? 'green' : 'red'}">
                    ${person.age ge 18 ? 'Jesteś pełnoletni' : 'Jesteś nieletni'}
                </p>
                <p>Informacje o Twojej prszegladarce: ${header['user-agent']}</p>
<%
    }
%>
</body>
</html>
