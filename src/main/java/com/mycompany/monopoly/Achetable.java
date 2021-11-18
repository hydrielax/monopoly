/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;
public abstract class Achetable extends Case{
    private Joueur proprietaire;
    private final int prix;
    
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
        // TODO: Finish this method
        if (this.proprietaire != null) {
            return this.getNom() + "(Coût : " + this.getPrix() +") - prorpiétaire:" +this.getProprietaire().getNom();
        } else {
            return this.getNom() + " (coût :" + this.getPrix() + ") - Sans proprietaire";
        }    
    }
    
    public void faillite(Joueur j){
        if(this.proprietaire == j){
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
