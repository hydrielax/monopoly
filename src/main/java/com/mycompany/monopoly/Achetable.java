package com.mycompany.monopoly;
public abstract class Achetable{
    private Joueur joueur;
    private double prix;

    @Override
    public toString(){
        System.out.println("le" + this.joueur.getName() + " a acheté une propriété pour " + this.joueur.getPrix())
    }
    
}