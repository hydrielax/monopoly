package com.mycompany.monopoly;
public class AllerEnPrison extends Case{
    public AllerEnPrison(String nom) {
        super(nom);
    }
    
    public void utiliser(Joueur j, int valeurDe){
        
    }
    @Override
    public String toString(){
        String res = "Vous êtes sur la case aller en prison";
        return res;
    }
}
