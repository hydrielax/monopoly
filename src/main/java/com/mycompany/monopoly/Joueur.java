package com.mycompany.monopoly;
import java.lang.Math;
public class Joueur{
    
    private String nom;
    private int fortune;
    private Case position;
    private Plateau plateau;
    

    public Joueur(String nom, Plateau plateau, Case pos){
        this.nom = nom;
        //this.plateau = new Plateau(plateau);
        this.fortune = 100000;
        this.position = pos;
    }
    public Joueur(String nom){
        this.nom = nom;
        this.fortune = 100000;
    }
    
    public String getNom(){
        return this.nom;
    }
    public int getFortune(){
        return this.fortune;
    }
    public Case getPosition(){
        return this.position;
    }
    public Plateau getPlateau(){
        return this.plateau;
    }

    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPosition(Case pos){
        this.position=pos;
    }
    public void setFortune(int fort){
        this.fortune = fort;
    }
    public void setPlateau(Plateau plat){
        this.plateau = plat;
    }
    /*
    public int nbGares(){
        return(this.plateau.nbGares(this));
    }
    */
    public void payer(Joueur j, int prix) throws NoMoreMoneyException {
        if (this.fortune>=prix){
            this.fortune=this.fortune-prix;
            j.setFortune(j.getFortune()+prix);
        }
        else{
            j.setFortune(j.getFortune()+this.fortune);
            throw new NoMoreMoneyException();
        }
    }

    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random()*6))+1;
    }
    /**
    public void tourDeJeu() throws NoMoreMoneyException{
        // lancer le dé
        int de = lanceLeDe();
        position = plateau.avancer(this.position, de);
        position.utiliser(this);
        
    }
    */

    public String toString(){
        String res = "vous êtes le joueur " + this.nom + ", vous possedez : " + this.fortune ;
        return res;
    }    
}