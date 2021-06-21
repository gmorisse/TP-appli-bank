<%-- 
    Document   : ListeConseillers
    Created on : 21 juin 2021, 12:18:51
    Author     : btern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Conseillers</title>
        <link rel="stylesheet" href ="CSS/style.css"/>
        <link rel="stylesheet"
            href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
            integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%@include file="navbarAdmin.jsp" %>
        
        <h3 class="text-center titre-perso mt-4">Liste des Conseillers</h3>
        
        <br>
        
        <div class="container">
            <div class="row">
                <c:forEach var="n" items="${listeConseillers}">
                    <div class="col-sm-6">
                        <div class="card my-font-family p-2">
                            <div class="row mt-4">
                                <div class="col-sm-9">
                                    <h3 class="titre-perso">${n.prenom} ${n.nom}</h3>
                                    <br>
                                    <p>Login : ${n.login}</p>
                                    <p>Mot de Passe : ******</p>
                                    <p>Adresse e-mail : ${n.mail}</p>
                                </div>
                                <div class="col-sm-3">
                                    <br>
                                    <i class="fa fa-user fa-4x"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                 </c:forEach>
            </div>
        </div>
        
        <br>
        
        <div>
             <button type="button" onclick="window.location.href = 'Admin'" class="btn btn-block btn-primary">Retour</button>
        </div>
        
        
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://unpkg.com/popper.js@1.12.6/dist/umd/popper.js"
        integrity="sha384-fA23ZRQ3G/J53mElWqVJEGJzU0sTs+SvzG8fXVWP+kJQ1lwFAOkcUOysnlKJC33U"
        crossorigin="anonymous"></script>
        <script src="https://unpkg.com/bootstrap-material-design@4.1.1/dist/js/bootstrap-material-design.js"
        integrity="sha384-CauSuKpEqAFajSpkdjv3z9t8E7RlpJ1UP0lKM/+NdtSarroVKu069AlsRPKkFBz9"
        crossorigin="anonymous"></script>
    </body>
</html>
