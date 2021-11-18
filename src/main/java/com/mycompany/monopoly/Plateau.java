package com.mycompany.monopoly;

import java.util.LinkedList;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Plateau {
    @Getter
    @Setter
    private ArrayList<Case> cases;

    @Getter
    @Setter
    private LinkedList<Joueur> joueurs;

    public Plateau() {
        cases = new ArrayList<Case>();
        joueurs = new ArrayList<Joueur>();

    }

    public void initPlateau() { // TODO: Finish this method @Zijie
        throw new UnsupportedOperationException();

    }

    public void affiche() { // TODO: Finish this method @Zijie
        throw new UnsupportedOperationException();
    }

    public int nbgares(Joueur j) {
        return (int) cases.stream().filter(c -> c instanceof Gare g && g.getJoueur() == j).count();
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
