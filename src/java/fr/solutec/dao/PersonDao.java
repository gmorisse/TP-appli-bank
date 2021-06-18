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
       

    
    public static Person getByLoginAndPassword(String login, String password) throws SQLException{
    Person p = null;
    // MODIFIER REQUETE
        String sql = "INSERT INTO person (nom, prenom, login, password) VALUES (?, ?, ?, ?)";
        
        Connection connexion = AccessBD.getConnection();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, p.getNom());
        requete.setString(2, p.getPrenom());
        requete.setString(3, p.getLogin());
        requete.setString(4, p.getPassword());
        
        requete.execute();
    
    return p;
    }
    
    public static void insertUser(Person person) throws SQLException{
        // String sql = "INSERT INTO person (nom, prenom, login, password) VALUES (" + user.getNom() + ", " + user.getPrenom() + ", " + user.getLogin() + ", " + user.getPassword() + "";
        // A ne pas utiliser -> faille d'injection SQL
        String sql = "INSERT INTO person (nom, prenom, login, password) VALUES (?, ?, ?, ?)";
        
        Connection connexion = AccessBD.getConnection();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, person.getNom());
        requete.setString(2, person.getPrenom());
        requete.setString(3, person.getLogin());
        requete.setString(4, person.getPassword());
        
        requete.execute();
        
    }

}
