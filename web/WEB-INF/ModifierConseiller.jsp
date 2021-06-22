<%-- 
    Document   : ModifierConseiller
    Created on : 21 juin 2021, 12:26:10
    Author     : Pierre
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ModifierConseiller</title>
    </head>
    <body>
        <%@include file="navbarAdmin.jsp" %> 

        <div class="container">
            <form class="my-font-family" action="ModifierConseiller" method="POST">
                <h2 class="center mt-4">Modification d'un conseiller</h2>
                <div class="form-group row mt-5">
                    <label class="col-sm-5 col-form-label"><strong>Pour quel conseiller souhaitez-vous modifier le profil ?</strong></label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="loginDemande" placeholder="login">
                    </div>
                    <div>
                        <button type='submit' class="btn bt-perso btn-outline-dark">Entrer</button>
                       
                    </div>
                    <div>
                        <label class="color-red ml-2" nom='msg'>${msg}</label>
                    </div>
                    <div>
                        <button type='button' onclick="window.location.href = 'Admin'" class="btn bt-perso btn-outline-dark ml-5">Retour</button>
                    </div>
                </div>
            </form>
            
                <c:choose>
                    <c:when test="${isConseiller == true}">
                        <form class="my-font-family" action="" method="POST">
                            <div class="form-group mt-4">
                                <label>Nom</label>
                                <input type="text" class="form-control" name="nom" value="${pers.nom}">
                            </div>
                            <div class="form-group mt-4">
                                <label>Prénom</label>
                                <input type="text" class="form-control" name="prenom" value="${pers.prenom}">
                            </div>
                            <div class="form-group mt-4">
                                <label>Login</label>
                                <input type="text" class="form-control" name="login" value="${pers.login}">
                            </div>
                            <div class="form-group mt-4">
                                <label>Email</label>
                                <input type="email" class="form-control" name="email" value="${pers.mail}">
                            </div>
                            <button type="submit" class="btn btn-primary">Soumettre</button>
                        </form>
                    </c:when>
                    <c:otherwise>
                        <div></div>
                    </c:otherwise>
                </c:choose>
            

        </div>
    </body>
</html>
