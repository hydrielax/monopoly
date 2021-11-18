/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

/**
 *
 * @author youne
 */
public abstract class Achetable extends Case {
    private Joueur proprietaire;
    private int prix;

    public Achetable(Joueur proprietaire, int prix, String nom) {
        super(nom);
        this.proprietaire = proprietaire;
        this.prix = prix;
    }

    public Achetable(int prix, String nom) {
        super(nom);
        this.prix = prix;
    }
    
    public Achetable(String nom){
        super(nom);
    }
    
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }


    
    
}
