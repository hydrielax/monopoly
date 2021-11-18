package com.mycompany.monopoly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Plateau {

    private ArrayList<Case> cases;

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
    public int nbGares(Joueur j) {
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
            System.out.println("Fin de partie, `" + joueurs.get(0).getNom() + "` a gagné !");
        }
        return isEnded;
    }

    public void tourDeJeu() {
        Iterator<Joueur> iter = joueurs.iterator();
        while (iter.hasNext()) {
            Joueur j = iter.next();
            try {
                j.tourDeJeu();
            } catch (NoMoreMoneyException e) {
                joueurs.remove(j);
                Iterator<Case> iterCase = cases.iterator();
                while (iterCase.hasNext()) {
                    Case c = iterCase.next();
                    if (c instanceof Achetable a) {
                         a.faillite(j);
                    }
                }
            }
        }
    }

    public int avance(int c, int d) {
        return (c + d) % cases.size();
    }
}
