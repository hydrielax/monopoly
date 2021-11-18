package com.mycompany.monopoly;
public class Depart extends Case{

    public Depart(String nom) {
        super(nom);
    }
    public void utiliser(Joueur j){
        
    }
    @Override
    public String toString(){
        String res = "Vous êtes sur la case départ";
        return res;
    }
}
