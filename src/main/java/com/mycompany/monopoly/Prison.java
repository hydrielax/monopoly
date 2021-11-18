package com.mycompany.monopoly;
public class Prison extends Case{

    public Prison(String nom) {
        super(nom);
    }
    

    public void utiliser(Joueur j, int valeurDe){
        
    }
    @Override
    public String toString(){
        String res = "Vous êtes sur la case prison";
        return res;
    }
}
