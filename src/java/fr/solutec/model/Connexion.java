/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class Connexion {
    private int idConnexion;
    private Date date;
    private int idPerson;

    public Connexion(int idConnexion, Date date, int idPerson) {
        this.idConnexion = idConnexion;
        this.date = date;
        this.idPerson = idPerson;
    }

    public Connexion() {
    }

    public int getIdConnexion() {
        return idConnexion;
    }

    public void setIdConnexion(int idConnexion) {
        this.idConnexion = idConnexion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
    
    
}
