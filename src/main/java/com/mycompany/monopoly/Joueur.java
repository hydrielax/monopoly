package com.mycompany.monopoly;
import static java.lang.Math;

public class Joueur{
    private String nom;
    private double fortune;
    private Case position;
    private Plateau plateau;
    

    public void Joueur(String nom, Plateau plateau){
        this.nom = nom;
        this.plateau = plateau;
    }
    
    
    public int nbGares(){
        return(this.plateau.nbGares(this))
    }

    public void payer(Joueur j, int prix) throws NoMoreMoneyException {
        if (this.fortune>=prix){
            this.fortune=this.fortune-prix;
            j.setFortune(j.getFortune()+this.fortune;
        }
        else{
            j.setFortune(j.getFortune()+this.fortune);
            throw new NoMoreMoneyException();
        }
    }

    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random()*6))+1;
    }

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