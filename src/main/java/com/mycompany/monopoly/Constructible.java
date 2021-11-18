package com.mycompany.monopoly;

public class Constructible extends Achetable {
    private int nbMaison;
    private int nbHotel;
    double prixMaison = 100;
    double prixHotel = 1000;

    public Constructible() {
        this.nbMaison = 0;
        this.nbHotel = 0;
    }

    public double loyer() {
        if(super().propietaire == null){
            return 0;
        }
        double res = nbMaison * prixMaison + nbHotel * prixHotel;
        return res;
    }

    @Override
    public void utiliser(Joueur j) {

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
    
    public void setPrixMaison(double newPrix){
        prixMaison = newPrix;
    }
    
    public void setPrixHotel(double newPrix){
        prixHotel = newPrix;
    }

    public void faillite(Joueur j){
        if(this.proprietaire == j){
            super.faillite(j);
            this.nbMaison = 0;
            this.nbHotel = 0;
        }
    }
}
