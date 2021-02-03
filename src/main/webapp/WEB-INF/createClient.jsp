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
 <br>
 <div class="row col-md-12">
  <div class="col-md-4"></div>
  <div class="col-md-4">
  <form action="create" method="post">
   <div class="form-group">
    <label class="">Nom</label>
     <input class="form-control" type="text" name="nom" />
   </div>
    <div class="form-group">
    <label class="">Adresse</label>
     <input class="form-control" type="text" name="adresse" />
    </div>
    <input class="btn btn-success" type="submit" value="Valider">
  </form>
  </div>
 </div>
</body>
</html>