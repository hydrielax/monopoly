package com.mycompany.monopoly;

import com.mycompany.monopoly.exceptions.NoMoreMoneyException;

public class Constructible extends Achetable {
    private int nbMaison;
    private int nbHotel;
    int prixMaison = 100;
    int prixHotel = 1000;

    public Constructible() {
        this.nbMaison = 0;
        this.nbHotel = 0;
    }

    public int loyer() {
        int res = nbMaison * prixMaison + nbHotel * prixHotel;
        return res;
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
            int loyer = loyer();
            j.payer(getProprietaire(), loyer);
        }
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public int getNbHotel() {
        return nbHotel;
    }

    public double getPrixMaison() {
        return prixMaison;
    }

    public double getPrixHotel() {
        return prixHotel;
    }
    
    public void ajoutMaison() {
        nbMaison += 1;
    }

    public void ajoutHotel() {
        nbHotel += 1;
    }

    public void faillite(Joueur j){
        if(this.getProprietaire() == j){
            super.faillite(j);
            this.nbMaison = 0;
            this.nbHotel = 0;
        }
    }
}
