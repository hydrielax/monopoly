/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

import com.mycompany.monopoly.exceptions.NoMoreMoneyException;

/**
 *
 * @author youne
 */
public class Gare extends Achetable{
    private final int loyer;
    
    public Gare(Joueur j, int prix, String nom){
        super(j, prix, nom);
        this.loyer = 2500;
    }

    public int loyer(){
        return this.loyer;
    }

    @Override
    public void utiliser(Joueur j) throws NoMoreMoneyException {
        if(getProprietaire() == null) {
            //todo si dé impair
            if(j.getFortune() >= getPrix()) {
                setProprietaire(j);
                j.setFortune(j.getFortune()-getPrix());
            }
        } else if(getProprietaire() != j) {
            int loyer = loyer() * j.nbGares();
            j.payer(getProprietaire(), loyer);
        }
    }
}
