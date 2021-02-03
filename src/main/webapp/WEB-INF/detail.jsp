<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>
        Détails
    </title>
    <%@include file="commons/header.jsp"%>
</head>
<body>
<%@include file="commons/menu.jsp"%>
<br>
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-8">
            <div class="card">
                <div class="card-body">
                    <h2 class="text-center">Facture N° <c:out value="${facture.numero}" /></h2>
                    <div class="row">
                        <div class="col-6">
                            <p>
                                Date de facturation :  <fmt:formatDate pattern="dd/MM/yyyy" type="date" value="${facture.date}" />
                            </p>
                            <p>
                                Numéro de facture :  <c:out value="${facture.numero}" />
                            </p>
                        </div>
                        <div class="col-md-3"></div>
                        <div class="col-3">
                            <p>
                                <c:out value="${facture.client.nom}" />
                            </p>
                            <p>
                                <c:out value="${facture.client.adresse}" />
                            </p>
                        </div>
                    </div>
                    <br>
                    <div class="form-group">
                        <table class="table table-hover table-bordered">
                            <thead class="thead-dark">
                            <tr>
                                <th>Article</th>
                                <th>Quantité</th>
                                <th>Prix</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${facture.lignesFacture}" var="ligne">
                                <tr>
                                    <td>
                                        <c:out value="${ligne.article.nomProduit}" />
                                    </td>
                                    <td>
                                        <c:out value="${ligne.qte}" />
                                    </td>
                                    <td>
                                        <c:out value="${ligne.prix}" />
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="form-group">
                        <div class="float-right">
                            Total :
                            <span class="font-weight-bold">
                                <c:out value="${facture.prix}" />
                            </span>
                            euros
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
