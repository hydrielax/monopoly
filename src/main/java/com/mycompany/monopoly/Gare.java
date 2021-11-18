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
public class Gare extends Achetable{
    private int loyer;
    
    public Gare(Joueur j, int prix, String nom){
        super(j, prix, nom);
        this.loyer = 0;
    }
    public int loyer(){
        return this.loyer;
    }
    @Override
    public void utiliser(Joueur j){
        
    }
    
    
}
