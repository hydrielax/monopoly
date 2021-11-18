package com.mycompany.monopoly;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Plateau {

    /**
     * Liste des cases du plateau
     */
    @Getter
    private final ArrayList<Case> cases = new ArrayList<>();
    /**
     * Liste des joueurs
     */
    private final LinkedList<Joueur> joueurs = new LinkedList<>();

    /**
     * Créer les cases et les joueurs
     */
    public void initPlateau() { // TODO: Finish this method
        cases.add(new Depart());
        cases.add(new Constructible("Mediter Ranean Avenue", 60));
        cases.add(new NonAchetable("Community Chest"));
        cases.add(new Constructible("Baltic Avenue", 60));
        cases.add(new NonAchetable("Income Tax"));

        cases.add(new Gare("Reading Railroad", 200));

        cases.add(new Constructible("Oriental Avenue", 100));
        cases.add(new NonAchetable("Chance"));
        cases.add(new Constructible("Vermont Avenue", 100));
        cases.add(new Constructible("Connecticut Avenue", 120));

        cases.add(new Prison());

        cases.add(new Constructible("St. Charles Place", 140));
        cases.add(new Constructible("Electric Company", 150));
        cases.add(new Constructible("States Avenue", 140));
        cases.add(new Constructible("Virginia Avenue", 160));

        cases.add(new Gare("Pensylvania Railroad", 200));

        cases.add(new Constructible("St. James Place", 180));
        cases.add(new NonAchetable("Community Chest"));
        cases.add(new Constructible("Tennessee Avenue", 180));
        cases.add(new Constructible("New York Avenue", 200));

        cases.add(new ParcGratuit());

        cases.add(new Constructible("Kentucky Avenue", 220));
        cases.add(new NonAchetable("Chance"));
        cases.add(new Constructible("Indiana Avenue", 220));
        cases.add(new Constructible("Illinois Avenue", 240));

        cases.add(new Gare("B.& O. Railroad", 200));

        cases.add(new Constructible("Atalantic Avenue", 260));
        cases.add(new Constructible("Ventnor Avenue", 260));
        cases.add(new NonAchetable("Water Works"));
        cases.add(new Constructible("Marvin Gardens", 280));
        cases.add(new AllerEnPrison());

        cases.add(new Constructible("Pacific Avenue", 300));
        cases.add(new Constructible("North Carolina Avenue", 300));
        cases.add(new NonAchetable("Community Chest"));
        cases.add(new Constructible("Pensylvania Avenue", 320));

        cases.add(new Gare("Short line", 200));

        cases.add(new NonAchetable("Chance"));
        cases.add(new Constructible("Park Place", 350));
        cases.add(new NonAchetable("Luxury Tax"));
        cases.add(new Constructible("Boardwalk", 400));
    }

    /**
     * Afficher le plateau
     */
    public void affiche() { // TODO: Finish this method
        for (var c : cases) {
            System.out.println(c);
        }
    }

    /**
     * Donner le nombre des gares que possède un joueur.
     * 
     * @param j Le joueur en question.
     * @return nombre de gare pour le joueur
     */
    public int nbGares(Joueur j) {
        return (int) cases.stream().filter(c -> c instanceof Gare g && g.getProprietaire().equals(j)).count();
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
