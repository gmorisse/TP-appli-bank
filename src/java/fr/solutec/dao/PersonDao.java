/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class PersonDao {

    public static Person getByLoginAndPassword(String login, String password) throws SQLException {

        // MODIFIER REQUETE
        String sql = "SELECT * FROM person WHERE login =? and password =?";
        Person p = new User();
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
    
    public static void getAllConseiller(){
    
    }
}
