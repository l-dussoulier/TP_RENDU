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
 <h2>Liste des clients</h2>
 <table class="table table-hover">
  <thead>
  <tr>
   <th>Nom</th>
   <th>Adresse</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${clients}" var="client">
   <tr>
    <td>
     <c:out value="${client.nom}" />
    </td>
    <td>
     <c:out value="${client.adresse}" />
    </td>
   </tr>
  </c:forEach>
  </tbody>
 </table>

 <a class="btn btn-primary" href="../client/create">Créer un client</a>
</div>

<%@include file="commons/footer.jsp"%>
</body>
</html>
