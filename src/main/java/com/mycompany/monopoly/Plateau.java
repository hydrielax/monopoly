package com.mycompany.monopoly;

import java.util.ArrayList;
import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Plateau {
    @Getter
    @Setter
    private ArrayList<Case> cases;

    @Getter
    @Setter
    private LinkedList<Joueur> joueurs;

    public void initPlateau() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public void affiche() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    /**
     * Donner le nombre des gares que possède un joueur.
     * 
     * @param j Le joueur en question.
     */
    public int nbgares(Joueur j) {
        return (int) cases.stream().filter(c -> c instanceof Gare g && g.getJoueur().equals(j))
                .count();
    }

    /**
     * Indique si la partie est finie.
     */
    public boolean finDePartie() {
        // If there is only one player in the game, then the game ends.
        var isEnded = joueurs.size() == 1;
        if (isEnded) {
            System.out.println("Fin de partie, `" + joueurs.get(0) + "` a gagné !");
        }
        return isEnded;
    }

    public void tourDeJeu() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    public Case avance(Case c, int d) {
        // TODO: Finish this method
        throw new UnsupportedOperationException();
    }
}
