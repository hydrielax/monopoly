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
    /**
     * calcul le loyer
     * @return entier
     */
    public int loyer(){
        if(getProprietaire() != null) {
            return loyer * getProprietaire().nbGares();
        }
        return this.loyer;
    }
    /**
     * permet l'utilisation d'une gare
     * @param j joueur
     * @param valeurDe valeur du dé
     * @throws NoMoreMoneyException 
     */
    @Override
    public void utiliser(Joueur j, int valeurDe) throws NoMoreMoneyException {
        if(getProprietaire() == null) {
            if(valeurDe % 2 == 1) {
                if (j.getFortune() >= getPrix()) {
                    setProprietaire(j);
                    j.setFortune(j.getFortune() - getPrix());
                    System.out.println(j.getNom() + " achète " + this + " !");
                }
            }
        } else if(getProprietaire() != j) {
            int loyer = loyer();
            j.payer(getProprietaire(), loyer);
            System.out.println(j.getNom() + " paye le loyer de " + this.getNom() + " à " + getProprietaire().getNom() + " !");
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += ", loyer = "+loyer()+"€";
        return s;
    }
}
