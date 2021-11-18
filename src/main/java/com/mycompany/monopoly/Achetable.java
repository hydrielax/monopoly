package com.mycompany.monopoly;

import lombok.Getter;
import lombok.Setter;

public abstract class Achetable extends Case {
    @Getter
    @Setter
    private Joueur joueur;
    @Getter
    @Setter
    private double prix;

    @Override
    public String toString() {
        // TODO: Finish this method
        throw new UnsupportedOperationException();
        /*
         * return "le" + this.joueur.getName() + " a acheté une propriété pour " +
         * this.joueur.getPrix())
         */
    }

}
