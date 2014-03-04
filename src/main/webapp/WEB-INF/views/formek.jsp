<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>

<body>
<form:form method="POST" modelAttribute="atryb" action="/form">
    Imie:
    <form:input path="imie"/><br>
    Nazwisko:
    <form:input path="nazwisko"/><br>
    Wiek:
    <form:input path="wiek"/><br>
    <br><input type="submit" value="Accept"/>
</form:form>
</body>
</html>