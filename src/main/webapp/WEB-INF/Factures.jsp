<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="ISO-8859-1">
 <title>Facturation</title>
 <%@include file="commons/header.jsp"%>
</head>
<body>
<%@include file="commons/menu.jsp"%>
<div class="col-12">
 <h2>Liste des factures</h2>
 <table class="table table-hover">
  <thead>
  <tr>
   <th>Date</th>
   <th>Numero</th>
   <th>Prix</th>
   <th></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${factures}" var="factures">
   <tr>
    <td>
     <fmt:formatDate pattern="dd/MM/yyyy" type="date" value="${factures.date}" />
    </td>
    <td>
     <c:out value="${factures.numero}" />
    </td>
    <td>
     <c:out value="${factures.prix}" />
    </td>
    <td>
     <a href="Factures/Detail?id=<c:out value="${factures.id}"/>"/>
     Détail
     </a>
    </td>
   </tr>
  </c:forEach>
  </tbody>
 </table>
 <a class="btn btn-primary disabled" href="#">Ajouter une Facture</a>
</div>
</body>
</html>
