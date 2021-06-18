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
    private int entier;

    public Admin(int id, String nom, String prenom, String login, String password) {
        super(id, nom, prenom, login, password);
    }

    public Admin() {
    }

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) {
        this.entier = entier;
    }
    
    
}
