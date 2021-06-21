<%-- 
    Document   : ConseillerAffichageClient
    Created on : 21 juin 2021, 14:08:39
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <%@include file="navBarConseiller.jsp" %>  
        <div>

            <div class="mt-4 container">
                <h1>Gestion des clients</h1>
                <br>
                <br><br>
                <div class="row">
                    <c:forEach var="n" items="${clientsGeres}">
                        <div class="col-sm-4 pb-5">
                            <div class="card my-font-family p-2 card-shadow ">
                                <div class="row">
                                    <div class="col-sm-10">
                                        <form action="ConseillerAffichageClients" method="POST">
                                            <input type="hidden" value="${n.id}" name="idPerson" />
                                            <p class="label-perso">Nom : ${n.nom} </p>
                                            <p class="label-perso">Prenom : ${n.prenom} </p>
                                            <p class="label-perso">Login : ${n.login} </p>
                                            <p class="label-perso">Mail : ${n.mail} </p>
                                            <button type="submit" class="btn btn-block btn-primary">Consulter</button>
                                        </form>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
    </body>
</html>
