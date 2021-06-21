<%-- 
    Document   : client_contact
    Created on : 21 juin 2021, 11:49:09
    Author     : Valerie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Espace contact</title>
        <link rel="stylesheet" href="CSS/style.css" />
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">
        <link rel="stylesheet"
              href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
              integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="" style="color: steelblue">Espace client</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                            aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav nav-fill w-100 ">
                            <a class="nav-item nav-link" href="Client"> <i style="color: steelblue" class="fa fa-user fa-2x"> Home</i> </a>    
                            <a class="nav-item nav-link" href="InformationClient"> <i style="color: steelblue" class="fa fa-user fa-2x"> Information compte</i> </a>                        
                            <a class="nav-item nav-link" href="ProfilClient"> <i style="color: steelblue" class="fa fa-id-card fa-2x"> Accéder à votre profil</i> </a>
                            <a class="nav-item nav-link" href="Deco"> <i style="color: tomato" class="fa fa-lock fa-2x"></i> </a>                        
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <div class="mt-60 container">
            <col-sm-2>
                
            </col-sm-2>
            <col-sm-8>
            <form id="contact-form" method="post" action="contact.php" role="form">

                <div class="messages"></div>

                <div class="controls card-shadow" style='padding: 15px'>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="form_name">Nom *</label>
                                <input id="form_name" type="text" name="nom" class="form-control" placeholder="Veuillez entrer votre nom *" required="required" data-error="Ce champ est obligatoire.">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="form_lastname">Prénom *</label>
                                <input id="form_lastname" type="text" name="prenom" class="form-control" placeholder="Veuillez entrer votre prénom *" required="required" data-error="Ce champ est obligatoire.">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="form_email">Email *</label>
                                <input id="form_email" type="email" name="email" class="form-control" placeholder="Veuillez entrer votre email *" required="required" data-error="Un email valide est obligatoire.">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="form_need">Veuillez spécifier votre besoin *</label>
                                <select id="form_need" name="besoin" class="form-control" required="required" data-error="Veuillez spécifier votre besoin.">
                                    <option value=""></option>
                                    <option value="soucis compte">Problème sur le compte</option>
                                    <option value="soucis site">Problème sur le site</option>
                                    <option value="création compte">Demande de création de compte</option>
                                    <option value="decouvert">Demande d'autorisation de découvert</option>
                                    <option value="desactivation carte">Demande de désactivation de carte</option>
                                    <option value="desactivation carte">Demande de réactivation de carte</option>
                                    <option value="desactivation carte">Demande de désactivation de carte</option>
                                    <option value="Other">Autre</option>
                                </select>
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="form_message">Message *</label>
                                <textarea id="form_message" name="message" class="form-control" placeholder="Veuillez entrer votre message. *" rows="4" required="required" data-error="Veuillez laisser votre message ici."></textarea>
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <input type="submit" style="color: steelblue" class="btn btn-block btn-primary btn-success btn-send" value="Envoyer le message">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <p class="text-muted">
                                <strong>*</strong> Ces champs sont obligatoires. 
                        </div>
                    </div>
                </div>

            </form>
                </col-sm-8>
            <col-sm-2>
                
            </col-sm-2>
        </div>
    </body>
</html>
