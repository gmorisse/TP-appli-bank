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
public class User extends Person{
    private int idClient;
    private int idPerson;
    private boolean valide;

    public User(int idClient, int idPerson, boolean valide, int id, String nom, String prenom, String login, String password, String mail) {
        super(id, nom, prenom, login, password, mail);
        this.idClient = idClient;
        this.idPerson = idPerson;
        this.valide = valide;
    }

    public User(int idClient, int idPerson, boolean valide) {
        this.idClient = idClient;
        this.idPerson = idPerson;
        this.valide = valide;
    }

    public User() {
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }
    
    
    
}
