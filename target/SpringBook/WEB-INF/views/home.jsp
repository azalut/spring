<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../resources/style.css" />
</head>
<body>
     <div id="content">
         ${tekst}
         <br>${juzer.imie}
         <br>${juzer.nazwisko}
         <br>${juzer.wiek}
         <br>
         <br>${napisik}
     </div>
</body>
</html>