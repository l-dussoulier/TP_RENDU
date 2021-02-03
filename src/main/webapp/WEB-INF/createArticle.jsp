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
 <br>
  <div class="row col-md-12">
  <div class="col-md-4"></div>
   <div class="col-md-4">
  <form action="create" method="post">
   <div class="form-group">
   <label>N°</label>
    <input class="form-control" type="text" name="numero" />
   <label>Nom de l'article</label>
    <input class="form-control" type="text" name="nomProduit" />
   <label>Prix</label> <input class="form-control" type="text" name="prix" />
    <small  class="form-text text-muted">Il faut renseigner un float exemple(14.90)</small>
    <br>
   <input class="btn btn-success text-right" type="submit" value="Valider">
   </div>
  </form>
   </div>
   </div>
</body>
</html>