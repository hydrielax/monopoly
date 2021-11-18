package com.mycompany.monopoly;

public class Constructible extends Achetable{
    private int nbMaison;
    private int nbHotel; 
    static double prixMaison = 100 ;
    static double prixHotel = 1000 ;

    // où fait on le lien avec l'utilisateur ? 
    public Constructible(){
        this.nbMaison = 0;
        this.nbHotel = 0;
        // autre chose ? 
    }
    public double loyer(){
        double res = this.nbMaison*prixMaison + this.nbHotel*prisHotel
        return res;
    }
    public void ajoutMaison(){
        this.nbMaison += 1;
    }
    public void faillite(Joueur j){
        if(this.proprietaire == j){
            super.faillite(j);
            this.nbMaison = 0;
            this.nbHotel = 0;
        }
    public void ajoutHotel(){
        this.nbHotel += 1;
    }
}
