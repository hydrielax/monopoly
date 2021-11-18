package com.mycompany.monopoly;

import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Plateau {
    @Getter
    @Setter
    private LinkedList<Case> cases;

    @Getter
    @Setter
    private LinkedList<Joueur> joueurs;

    public void initPlateau() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public void affiche() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public int nbgares(Joueur j) {
        return (int) cases.stream().filter(c -> c instanceof Gare g && g.getJoueur().equals(j))
                .count();
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
