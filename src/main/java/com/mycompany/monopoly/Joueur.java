package com.mycompany.monopoly;

public class Joueur {

    private String nom;
    private int fortune;
    private int position;
    private Plateau plateau;

    public Joueur(String nom, Plateau plateau) {
        this.nom = nom;
        this.plateau = new Plateau(plateau);
        this.fortune = 100000;
        this.position = 0;
    }

    public Joueur(String nom) {
        this.nom = nom;
        this.fortune = 100000;
    }

    public String getNom() {
        return this.nom;
    }

    public int getFortune() {
        return this.fortune;
    }

    public int getPosition() {
        return this.position;
    }

    public Plateau getPlateau() {
        return this.plateau;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPosition(int pos) {
        this.position = pos;
    }

    public void setFortune(int fort) {
        this.fortune = fort;
    }

    public void setPlateau(Plateau plat) {
        this.plateau = plat;
    }

    public int nbGares() {
        return this.plateau.nbGares(this);
    }

    public void payer(Joueur j, int prix) throws NoMoreMoneyException {
        if (this.fortune >= prix) {
            this.fortune = this.fortune - prix;
            j.setFortune(j.getFortune() + prix);
        } else {
            j.setFortune(j.getFortune() + this.fortune);
            throw new NoMoreMoneyException();
        }
    }

    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random() * 6)) + 1;
    }

    public void tourDeJeu() throws NoMoreMoneyException {
        // lancer le dé
        int de = lanceLeDe();
        position = plateau.avancer(this.position, de);
        Case c = plateau.getCases().get(position);
        c.utiliser(this, de);
    }

    public String toString() {
        return "Joueur " + this.nom + ", avec : " + this.fortune + "€";
    }
}