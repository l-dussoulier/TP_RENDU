<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="ISO-8859-1">
 <title>Liste article</title>
 <%@include file="commons/header.jsp"%>
</head>
<body>
<%@include file="commons/menu.jsp"%>
<div class="col-12">
 <h2>Liste des articles</h2>
 <table class="table table-hover">
  <thead>
  <tr>
   <th>N°</th>
   <th>Nom du produit</th>
   <th>Prix</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${articles}" var="articles">
   <tr>
    <td>
     <c:out value="${articles.numero}" />
    </td>
    <td>
     <c:out value="${articles.nomProduit}" />
    </td>
    <td>
     <c:out value="${articles.prix}" />
    </td>
   </tr>
  </c:forEach>
  </tbody>
 </table>
 <a class="btn btn-primary text-left" href="../article/create">Créer un article</a>
</div>
</body>
</html>
