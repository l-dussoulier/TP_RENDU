<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>nouveau client !</title>
<%@include file="commons/header.jsp"%>
</head>
<body>
 <%@include file="commons/menu.jsp"%>

<form action="create" method="post">
 <label for="nomVoiture">Nom</label> <input type="text" name="nom" />
 <label for="couleurVoiture">Adresse</label> <input type="text" name="adresse" />

 <input type="submit" value="Valider">

</form>
 <%@include file="commons/footer.jsp"%>

</body>
</html>