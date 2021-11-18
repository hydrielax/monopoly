/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

public abstract class Achetable extends Case {
    private Joueur proprietaire;
    private final int prix;

    /**
     * constructeur 
     * @param proprietaire le proprietaire
     * @param prix le prix de la case
     * @param nom le nom de la case
     */
    public Achetable(Joueur proprietaire, int prix, String nom) {
        super(nom);
        this.proprietaire = proprietaire;
        this.prix = prix;
    }
    
    public Achetable(int prix, String nom) {
        super(nom);
        this.prix = prix;
    }

    @Override
    public String toString() {
        if (this.proprietaire != null) {
            return this.getNom() + "(Coût : " + this.getPrix() + "€) - propriétaire:" + this.getProprietaire().getNom();
        } else {
            return this.getNom() + " (coût :" + this.getPrix() + "€) - Sans proprietaire";
        }
    }
    /**
     * méthode pour gérer la faillite d'un joueur
     * @param j joueur
     */
    public void faillite(Joueur j) {
        if (this.proprietaire == j) {
            this.setProprietaire(null);
        }
    }

    public int getPrix() {
        return prix;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }

}
