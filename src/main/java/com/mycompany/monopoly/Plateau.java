package com.mycompany.monopoly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import com.mycompany.monopoly.exceptions.NoMoreMoneyException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

public class Plateau {

    /**
     * Liste des cases du plateau
     */
    private ArrayList<Case> cases = new ArrayList<>();
    /**
     * Liste des joueurs
     */
    private LinkedList<Joueur> joueurs = new LinkedList<>();

    /**
     * Créer les cases et les joueurs
     */
    public void initPlateau() { // TODO: Finish this method
        ArrayList<String> strInit = new ArrayList<String>();
        strInit.add()
        
        

        throw new UnsupportedOperationException();

    }

    /**
     * Afficher le plateau
     */
    public void affiche() { // TODO: Finish this method
        throw new UnsupportedOperationException();
    }

    /**
     * Donner le nombre des gares que possède un joueur.
     * 
     * @param j Le joueur en question.
     * @return nombre de gare pour le joueur
     */
    public int nbGares(Joueur j) {
        return (int) cases.stream().filter(c -> c instanceof Gare g && g.getJoueur().equals(j)).count();
    }

    /**
     * Indique si la partie est finie.
     * 
     * @return vrai si la partie est finie
     */
    public boolean finDePartie() {
        // If there is only one player in the game, then the game ends.
        var isEnded = joueurs.size() <= 1;
        if (joueurs.size() == 1) {
            System.out.println("Fin de partie, `" + joueurs.get(0).getNom() + "` a gagné !");
        }
        return isEnded;
    }

    /**
     * Joue un tour de jeu
     */
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

    /**
     * Avance d'un nombre de cases donné en paramètre
     * 
     * @param c Index de la case d'origine
     * @param d Nombre de cases à avancer
     * @return Index de la nouvelle case
     */
    public int avance(int c, int d) {
        return (c + d) % cases.size();
    }
}
