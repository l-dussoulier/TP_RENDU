<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <%@include file="header.jsp"%>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="article/ListeArticles">liste articles</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="client/ListeClient">Liste Client</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Factures">Liste Factures</a>
            </li>
        </ul>
    </div>
</nav>
</body>
</html>