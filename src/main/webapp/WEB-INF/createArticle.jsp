<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>nouvel article !</title>
<%@include file="commons/header.jsp"%>
</head>
<body>
 <%@include file="commons/menu.jsp"%>

<form action="create" method="post">
 <label>N°</label> <input type="text" name="numero" />
 <label>Nom de l'article</label> <input type="text" name="nomProduit" />
 <label>Prix</label> <input type="text" name="prix" />
 
 <input type="submit" value="Valider">
</form>
 <%@include file="commons/footer.jsp"%>

</body>
</html>