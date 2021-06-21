<%-- 
    Document   : client_page_info
    Created on : 21 juin 2021, 10:38:50
    Author     : Valerie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Votre profil</title>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Espace client</title>
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

<body style="background-color: steelblue">
    <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="" style='color: steelblue'>Votre profil</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                        aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav nav-fill w-100 ">
                        <a class="nav-item nav-link" href="Client"> <i style="color: steelblue" class="fa fa-home fa-2x"> Home</i> </a>
                        <a class="nav-item nav-link" href="InformationClient"> <i style="color: steelblue" class="fa fa-user fa-2x"> Information compte</i> </a>                        
                        <a class="nav-item nav-link" href="ContactClient"><i style="color: steelblue" class="fa fa-comment fa-2x"> Contact conseiller</i> </a>
                        <a class="nav-item nav-link" href="Deco"> <i style="color: tomato" class="fa fa-lock fa-2x"></i> </a>                        
                    </div>
                </div>
            </div>
        </nav>
    </div>

    <section>
        <div class="container mt-4" style="background-color:white">
            <div class="row">

                <div class="col-md-12 col-sm-12">
                    <h2 class="center" >Veuillez retrouver ici les informations sur votre profil.</h2>
                    <hr>
                </div>

            </div>
        </div>
    </section>


    <div class="container mt-120" style="background-color: white">
        <div class="row">

            <div class="col-md-4 col-sm-6">

                <div>
                    <div>
                        <div>
                            <img src="" alt="Photo de profil">
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-4 col-sm-6">

                <div>
                    <div>
                        <div>
                            <h4> <i class="fa fa-id-card"> Nom :</i></h4>
                            <p>${userConnecter.nom}</p>
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-4 col-sm-6">
                <div>
                    <div>
                        <div>
                            <h4> <i class="fa fa-id-card"> Prénom :</i></h4>
                            <p>${userConnecter.prenom}</p>
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-4 col-sm-6 mt-4">
                <div>
                    <div>
                        <div>
                            <h4> <i class="fa fa-id-card"> Mail :</i></h4>
                            <p>${userConnecter.mail}</p>
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-4 col-sm-6 mt-4">
                <div>
                    <div>
                        <div>
                            <h4> <i class="fa fa-id-card"> Mot de passe :</i></h4>
                            <p>${userConnecter.password}</p>
                        </div>
                    </div>
                </div>

            </div>




        </div>
    </div>
    <div class='mt-120 center'>
        <button type="submit" class="btn btn-primary" style="color: steelblue; background-color: white">Modifier les informations</button>
    </div>

</body>
</html>
