package com.mycompany.monopoly;
public class AllerEnPrison extends NonAchetable{
    public AllerEnPrison(String nom) {
        super(nom);
    }
    
    public void utiliser(Joueur j){
        
    }
    @Override
    public String toString(){
        String res = "Vous êtes sur la case aller en prison";
        return res;
    }
}
