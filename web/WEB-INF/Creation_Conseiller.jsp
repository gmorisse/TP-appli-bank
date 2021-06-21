<%-- 
    Document   : Creation_Conseiller
    Created on : 21 juin 2021, 10:38:25
    Author     : btern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creation Conseiller</title>
        <link rel="stylesheet" href="CSS/style.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">

        <link rel="stylesheet"

              href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"

              integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
    </head>
    <body>
        
        <%@include file="navbarAdmin.jsp" %>
        
        <h3 class="text-center titre-perso mt-4">Création de Conseiller</h3>

        <div class="container mt-4">
            <form action="CreationConseiller" method="POST">
                <div style="margin: auto; width: 40%">
                    <div class="form-group">
                        <label class="label-perso">Nom : </label>
                        <input type="text" name="nom" class="form-control " />
                    </div>
                    <div class="form-group">
                        <label class="label-perso">Prenom : </label>
                        <input type="text" name="prenom" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label class="label-perso">mail : </label>
                        <input type="text" name="mail" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label class="label-perso">Login : </label>
                        <input type="text" name="login" class="form-control" />
                    </div>
                    <div class="form-group">
                        <label class="label-perso">Password : </label>
                        <input type="password" name="pwd" class="form-control" />
                    </div>
                    <button type="submit" class="btn btn-block btn-info">Créer</button>
                    <button type="button" onclick="window.location.href = 'Admin'" class="btn btn-block btn-primary">Retour</button>
                    <div>
                        <p class="color-red center">${msgInscription}</p>
                    </div>
                </div>
            </form>
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
