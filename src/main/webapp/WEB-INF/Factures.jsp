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
     <c:out value="${factures.date}" />
    </td>
    <td>
     <c:out value="${factures.numero}" />
    </td>
    <td>
     <c:out value="${factures.prix}" />
    </td>
    <td>
     <c:out value="${factures.Id}" />
    </td>
   </tr>
  </c:forEach>
  </tbody>
 </table>

 <a class="btn btn-primary disabled" href="#">Ajouter une Facture</a>
</div>

<%@include file="commons/footer.jsp"%>
</body>
</html>
