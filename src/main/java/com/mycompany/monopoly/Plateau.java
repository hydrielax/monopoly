package com.mycompany.monopoly;

import java.util.LinkedList;



public class Plateau {
    
    private LinkedList<Case> cases;

    
    private LinkedList<Joueur> joueurs;

    public LinkedList<Case> getCases() {
        return cases;
    }

    public LinkedList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setCases(LinkedList<Case> cases) {
        this.cases = cases;
    }

    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public void initPlateau() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public void affiche() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public int nbgares() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public boolean finDePartie() {
        // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public void tourDeJeu() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public Case avance(Case c, int d) {
        // TODO: Finish this method
        throw new UnsupportedOperationException();
    }
}
