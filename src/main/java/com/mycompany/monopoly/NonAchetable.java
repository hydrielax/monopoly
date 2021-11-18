package com.mycompany.monopoly;

public class NonAchetable extends Case
{
    public NonAchetable(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return super.getNom();
    }

    @Override
    public void utiliser(Joueur j) {
        //vide
    }
}
