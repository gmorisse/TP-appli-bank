<%-- 
    Document   : Admin
    Created on : 18 juin 2021, 15:34:47
    Author     : btern
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href ="CSS/style.css"/>
        <link rel="stylesheet"
            href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
            integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Espace Admin</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"               
                        aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">          
                        <span class="navbar-toggler-icon"></span>       
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav nav-fill w-100">
                            <div class="col sm-11"></div>
                            <a class="nav-item nav-link col-sm-1" href="Deco"><i class="fa fa-lock fa-2x" style="color: tomato"></i></a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        
            <div class="card mt-4 ml-4 card-shadow" style="width: 40%">
                <div class="card-body">
                    <h3 class="my-font-family center">Votre Menu</h3>
                    <div class="row mt-4">
                        <div class="col-sm-1">
                            <div>
                                <i class="fa fa-user-plus col-sm-7 fa-2x"></i>
                            </div>
                            <div class="mt-3">
                                <i class="fa fa-user-times col-sm-7 fa-2x"></i>
                            </div>
                            <div class="mt-4">
                                <i class="fa fa-edit col-sm-7 fa-2x"></i>
                            </div> 
                            <div class="mt-3">
                                <i class="fa fa-list-alt col-sm-7 fa-2x"></i>
                            </div> 
                        </div>
                        <div class="col-sm-11">
                            <button type="button" onclick="window.location.href='Créer_Conseiller'" class="btn btn-block btn-outline-secondary">Créer Conseiller</button>
                            <button type="button" onclick="window.location.href='Désactiver_Conseiller'" class="btn btn-block btn-outline-secondary">Désactiver/Activer Conseiller</button>
                            <button type="button" onclick="window.location.href='Modifier_Conseiller'" class="btn btn-block btn-outline-secondary">Modifier Conseiller</button>
                            <button type="button" onclick="window.location.href='Liste_Conseillers'" class="btn btn-block btn-outline-secondary">Liste Conseillers</button>
                        </div>
                    </div>
                </div>
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
