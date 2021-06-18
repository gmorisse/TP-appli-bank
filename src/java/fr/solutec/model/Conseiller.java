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
public class Conseiller extends Person{
    private int idConseiller;
    private int idPerson;

    public Conseiller(int idConseiller, int idPerson, int id, String nom, String prenom, String login, String password, String mail) {
        super(id, nom, prenom, login, password, mail);
        this.idConseiller = idConseiller;
        this.idPerson = idPerson;
    }

    public Conseiller(int idConseiller, int idPerson) {
        this.idConseiller = idConseiller;
        this.idPerson = idPerson;
    }

    public Conseiller() {
    }

    public int getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(int idConseiller) {
        this.idConseiller = idConseiller;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
    
    
}
