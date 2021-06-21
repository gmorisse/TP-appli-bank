<%-- 
    Document   : ModifierConseiller
    Created on : 21 juin 2021, 12:26:10
    Author     : Pierre
--%>

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
                        <input type="text" class="form-control" name="login" placeholder="login">
                    </div>
                    <div>
                        <button type='submit' class="btn bt-perso btn-outline-dark">Entrer</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
