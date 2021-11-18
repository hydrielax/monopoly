package com.mycompany.monopoly;

public class Joueur{
    private String nom;
    private double fortune;
    private int position;
    private Plateau plateau;
    

    public void Joueur(String nom, Plateau plateau){
        this.nom = nom;
        this.plateau = plateau;
    }
    
    
}