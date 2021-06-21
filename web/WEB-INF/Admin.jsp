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
    </head>
    <body>
        <%@include file="navbarAdmin.jsp" %> 
        
            <div class="card mt-4 ml-4 card-shadow" style="width: 95%">
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
                            <button type="button" onclick="window.location.href='CreationConseiller'" class="btn btn-block btn-outline-secondary">Créer Conseiller</button>
                            <button type="button" onclick="window.location.href='Désactiver_Conseiller'" class="btn btn-block btn-outline-secondary">Désactiver/Activer Conseiller</button>
                            <button type="button" onclick="window.location.href='Modifier_Conseiller'" class="btn btn-block btn-outline-secondary">Modifier Conseiller</button>
                            <button type="button" onclick="window.location.href='ListeConseillers'" class="btn btn-block btn-outline-secondary">Liste Conseillers</button>
                        </div>
                    </div>
                </div>
            </div>
    </body>
</html>
