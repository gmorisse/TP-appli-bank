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

    
    return p;
    }
    
    public static int getIdByLogin(String login) throws SQLException{

    return 0;
    }
}
