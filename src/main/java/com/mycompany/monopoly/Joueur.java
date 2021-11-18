package com.mycompany.monopoly;

public class Joueur{
    private String nom;
    private double fortune;
    private Case position;
    private Plateau plateau;


    public void tourDeJeu() throws NoMoreMoneyException{
        // lancer le dé
        int de = lancerDe();
        position = plateau.avancer(this.position, de);
        position.utiliser(this);
        
    }

    public String toString(){
        String res = "vous êtes le joueur " + this.nom + ", vous possedez : " + this.fortune + "€" + " et vous êtes en " + position.getName();
        return res;
    }    
}