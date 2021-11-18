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
    private final int loyer;

    public Gare(String nom, int prix) {
        super(prix, nom);
        this.loyer = 2500;
    }

    public Gare(Joueur j, int prix, String nom){
        super(j, prix, nom);
        this.loyer = 2500;
    }

    public int loyer(){
        if(getProprietaire() != null) {
            return loyer * getProprietaire().nbGares();
        }
        return this.loyer;
    }

    @Override
    public void utiliser(Joueur j, int valeurDe) throws NoMoreMoneyException {
        if(getProprietaire() == null) {
            //todo si dé impair
            if(j.getFortune() >= getPrix()) {
                setProprietaire(j);
                j.setFortune(j.getFortune()-getPrix());
            }
        } else if(getProprietaire() != j) {
            int loyer = loyer();
            j.payer(getProprietaire(), loyer);
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += ", loyer = "+loyer()+"€";
        return s;
    }
}
