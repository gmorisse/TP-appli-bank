/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

/**
 *
 * @author PC
 */
public class Admin extends Person{
    
    private int idAdmin;
    private int idPerson;

    public Admin(int idAdmin, int idPerson, int id, String nom, String prenom, String login, String password, String mail) {
        super(id, nom, prenom, login, password, mail);
        this.idAdmin = idAdmin;
        this.idPerson = idPerson;
    }

    public Admin(int idAdmin, int idPerson) {
        this.idAdmin = idAdmin;
        this.idPerson = idPerson;
    }

    public Admin() {
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
    
    
    
    
}
