<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Poziom naowodnienia dziennego</title>
</head>
<body>
<h1>Śledzenie poziomu nawodnienia organizmu</h1>
<form action="control">
  <button name="option" value="water">Dodaj szklanke wody</button>
  <button name="option" value="clear">Wyzeruj nawodninie</button>

</form>
<%
  Object water = request.getSession().getAttribute("water");
  if (water == null) {
%>
<h2>Dziś jeszcze nic nie wypiłeś!</h2>
<%
} else {
%>
<h2>Dziś wypiłeś <%= water%> ml wody!</h2>
<%
  }
%>
</body>
</html>