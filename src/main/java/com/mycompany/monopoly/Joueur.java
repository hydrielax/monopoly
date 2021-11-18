package com.mycompany.monopoly;

import lombok.Getter;

public class Joueur {
    @Getter
    private String nom;
    private double fortune;
    private int position;
    private Plateau plateau;


}
