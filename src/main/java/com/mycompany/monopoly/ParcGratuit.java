package com.mycompany.monopoly;
public class ParcGratuit extends Case{

    public ParcGratuit(String nom) {
        super(nom);
    }
    
    public void utiliser(Joueur j, int valeurDe){
        
    }
    @Override
    public String toString(){
        String res = "Vous êtes sur la case parc gratuit";
        return res;
    }
}
