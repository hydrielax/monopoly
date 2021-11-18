package com.mycompany.monopoly;

import java.util.LinkedList;
import java.nio.channels.NonReadableChannelException;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

public class Plateau {
    @Getter
    @Setter
    private ArrayList<Case> cases;

    @Getter
    @Setter
    private LinkedList<Joueur> joueurs;

    public Plateau() {
        // constructor without parameters
        cases = new ArrayList<Case>();
        joueurs = new LinkedList<Joueur>();

    }

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

    public void affiche() { // TODO: Finish this method
        for (var c : cases) {
            System.out.println(c);
        }
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
