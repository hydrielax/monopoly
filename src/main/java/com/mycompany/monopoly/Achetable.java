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

    public void faillite(Joueur j){
        if(this.proprietaire == j){
            this.proprietaire = null;
        }
    }
    @Override
    public toString(){
        System.out.println("le" + this.joueur.getName() + " a acheté une propriété pour " + this.joueur.getPrix())
    }
    
}
