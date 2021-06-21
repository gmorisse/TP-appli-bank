/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.controller.CompteController;
import fr.solutec.model.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Instant.now;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author PC
 */
public class PersonDao {

    public static Person getByLoginAndPassword(String login, String password) throws SQLException {

        // MODIFIER REQUETE
        String sql = "SELECT * FROM person WHERE login =? and password =?";
        Person p = new Person();
        Connection connexion = AccessBD.getConnexion();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, login);
        requete.setString(2, password);
        ResultSet rs = requete.executeQuery();
        if (rs.next()) {
            p.setId(rs.getInt("idPerson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setLogin(rs.getString("login"));
            p.setMail(rs.getString("mail"));
        }
        return p;
    }
    
     public static Person getByLogin(String login) throws SQLException {

        // MODIFIER REQUETE
        String sql = "SELECT * FROM person WHERE login =?";
        Person p = new Person();
        Connection connexion = AccessBD.getConnexion();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, login);
        ResultSet rs = requete.executeQuery();
        if (rs.next()) {
            p.setId(rs.getInt("idPerson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setLogin(rs.getString("login"));
            p.setMail(rs.getString("mail"));
        }
        return p;
    }

    public static void insertUser(Person person) throws SQLException {
        // String sql = "INSERT INTO person (nom, prenom, login, password) VALUES (" + user.getNom() + ", " + user.getPrenom() + ", " + user.getLogin() + ", " + user.getPassword() + "";
        // A ne pas utiliser -> faille d'injection SQL
        String sql1 = "INSERT INTO person (nom, prenom, login, password, mail) VALUES (?, ?, ?, ?, ?)";

        Connection connexion = AccessBD.getConnexion();

        PreparedStatement requete1 = connexion.prepareStatement(sql1);
        requete1.setString(1, person.getNom());
        requete1.setString(2, person.getPrenom());
        requete1.setString(3, person.getLogin());
        requete1.setString(4, person.getPassword());
        requete1.setString(5, person.getMail());

        requete1.execute();

        String sql2 = "INSERT INTO client (Person_idPerson) VALUES (?)";

        PreparedStatement requete2 = connexion.prepareStatement(sql2);
        requete2.setInt(1, getIdByLogin(person.getLogin()));

        requete2.execute();

    }

    public static void insertConseiller(Person person) throws SQLException {
        String sql1 = "INSERT INTO person (nom, prenom, login, password, mail) VALUES (?, ?, ?, ?, ?)";

        Connection connexion = AccessBD.getConnexion();

        PreparedStatement requete1 = connexion.prepareStatement(sql1);
        requete1.setString(1, person.getNom());
        requete1.setString(2, person.getPrenom());
        requete1.setString(3, person.getLogin());
        requete1.setString(4, person.getPassword());
        requete1.setString(5, person.getMail());

        requete1.execute();

        String sql2 = "INSERT INTO conseiller (Person_idPerson) VALUES (?)";

        PreparedStatement requete2 = connexion.prepareStatement(sql2);
        requete2.setInt(1, getIdByLogin(person.getLogin()));

        requete2.execute();

    }

    public static boolean isAdmin(Person p) throws SQLException {
        boolean isAdmin = false;
        String sql = "SELECT * FROM admin a INNER JOIN person p ON p.idPerson = a.Person_idPerson WHERE p.idPerson = ? ";

        Connection connexion = AccessBD.getConnexion();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, getIdByLogin(p.getLogin()));

        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {
            isAdmin = true;
        }

        return isAdmin;
    }

    public static boolean isConseiller(Person p) throws SQLException {
        boolean isConseiller = false;
        String sql = "SELECT * FROM conseiller c INNER JOIN person p ON p.idPerson = c.Person_idPerson WHERE p.idPerson = ? ";

        Connection connexion = AccessBD.getConnexion();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, getIdByLogin(p.getLogin()));

        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {
            isConseiller = true;
        }

        return isConseiller;
    }

    public static int getIdByLogin(String login) throws SQLException {
        Person p = null;
        String sql = "SELECT * FROM person WHERE login=?";

        Connection connexion = AccessBD.getConnexion();

        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, login);

        ResultSet rs = requete.executeQuery();

        if (rs.next()) {
            p = new Person();
            p.setId(rs.getInt("idPerson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setLogin(rs.getString("login"));
            p.setMail(rs.getString("mail"));
        }

        return p.getId();
    }

    public static boolean isValidUser(Person p) throws SQLException {
        boolean valid = false;
        String sql = "SELECT * FROM client c INNER JOIN person p ON p.idPerson = c.Person_idPerson WHERE p.idPerson = ? ";

        Connection connexion = AccessBD.getConnexion();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, getIdByLogin(p.getLogin()));

        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {
            valid = rs.getBoolean("valide");
        }

        return valid;

    }

    public static boolean inscriptionValide(Person p) {
        boolean valide = true;

        if (p.getLogin().equals("")) {
            valide = false;
        }
        if (p.getPassword().equals("")) {
            valide = false;
        }
        if (p.getNom().equals("")) {
            valide = false;
        }
        if (p.getPrenom().equals("")) {
            valide = false;
        }
        if (p.getMail().equals("")) {
            valide = false;
        }

        return valide;
    }

    public static List<Person> getAllConseiller() throws SQLException {
        List<Person> listeConseillers = new ArrayList<>();

        String sql = "SELECT * FROM person p INNER JOIN conseiller c ON p.idPerson = c.Person_idPerson";

        Connection connexion = AccessBD.getConnexion();
        Statement requete = connexion.createStatement();

        ResultSet rs = requete.executeQuery(sql);
        while (rs.next()) {

            Person p = new Person();
            p.setId(rs.getInt("idPerson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setLogin(rs.getString("login"));
            p.setMail(rs.getString("mail"));

            listeConseillers.add(p);
        }

        return listeConseillers;

    }

    public static List<Person> getAllDemandesValidation() throws SQLException {
        List<Person> demandesComptes = new ArrayList();

        String sql = "SELECT * FROM client c INNER JOIN person p ON c.Person_idPerson = p.idperson WHERE c.valide = FALSE";

        Connection connection = AccessBD.getConnexion();
        PreparedStatement prepare = connection.prepareStatement(sql);

        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {

            Person p = new Person();
            p.setId(rs.getInt("idperson"));
            p.setNom(rs.getString("nom"));
            p.setPrenom(rs.getString("prenom"));
            p.setLogin(rs.getString("login"));
            p.setMail(rs.getString("mail"));

            demandesComptes.add(p);
        }

        return demandesComptes;
    }

    public static void validationCompteClient(int idPerson, int idConseiller) throws SQLException {

        String sql1 = "UPDATE client c SET valide = TRUE WHERE c.Person_idPerson = ?";

        Connection connexion = AccessBD.getConnexion();

        PreparedStatement requete1 = connexion.prepareStatement(sql1);
        requete1.setInt(1, idPerson);
        requete1.execute();

        String sql2 = "INSERT INTO compte (numCompte, soldeCompte, numCarte, Client_idClient, idConseiller) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement requete2 = connexion.prepareStatement(sql2);
        requete2.setString(1, CompteController.genererNumeroCompte());
        requete2.setInt(2, 0);
        requete2.setInt(3, CompteController.genererNumeroCarte());
        requete2.setInt(4, idPerson);
        requete2.setInt(5, idConseiller);
        requete2.execute();

    }

    public static List<Person> getAllClient(Person p) throws SQLException {
        List<Person> clients = new ArrayList();

        String sql = "SELECT* from person p INNER JOIN client ct ON ct.Person_idPerson = p.idPerson INNER JOIN compte cm ON cm.Client_idClient=ct.idClient WHERE cm.idConseiller = ?;";

        Connection connection = AccessBD.getConnexion();
        PreparedStatement prepare = connection.prepareStatement(sql);
        prepare.setInt(1, getIdConseiller(p));
        ResultSet rs = prepare.executeQuery();

        while (rs.next()) {

            Person person = new Person();
            person.setId(rs.getInt("idperson"));
            person.setNom(rs.getString("nom"));
            person.setPrenom(rs.getString("prenom"));
            person.setLogin(rs.getString("login"));
            person.setMail(rs.getString("mail"));

            clients.add(person);
        }

        return clients;
    }

    public static int getIdConseiller(Person p) throws SQLException {
        int retour = 0;
        String sql = "SELECT * FROM conseiller co INNER JOIN person p ON p.idPerson=co.Person_idPerson WHERE p.idPerson = ?";

        Connection connexion = AccessBD.getConnexion();

        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setInt(1, p.getId());

        ResultSet rs = requete.executeQuery();

        if (rs.next()) {
            retour = rs.getInt("idConseiller");
        }

        return retour;
    }

    public static void majHistoriqueConnexion(Person p) throws SQLException {
        String sql1 = "INSERT INTO historiqueconnexion (dateConnexion, idPerson) VALUES (?, ?)";
        Calendar calendar = Calendar.getInstance();

        java.util.Date currentDate = calendar.getTime();

        java.sql.Date date = new java.sql.Date(currentDate.getTime());

        Connection connexion = AccessBD.getConnexion();

        PreparedStatement requete1 = connexion.prepareStatement(sql1);
        requete1.setDate(1, date);
        requete1.setInt(2, p.getId());

        requete1.execute();

    }
}
