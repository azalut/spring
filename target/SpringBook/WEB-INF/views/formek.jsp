<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../resources/style.css">
</head>

<body>
<div class="content">
    <form:form method="POST" modelAttribute="atryb" action="/add">
        Imie:
        <form:input path="imie"/><br>
        Nazwisko:
        <form:input path="nazwisko"/><br>
        Wiek:
        <form:input path="wiek"/><br>
        <br><input type="submit" value="Accept"/>
    </form:form>
</div>
</body>
</html>