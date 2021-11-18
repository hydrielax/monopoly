/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

/**
 * @author youne
 */
public abstract class Case {
    private String nom;

    public Case(String nom) {
        this.nom = nom;
    }

    /**
     * Effectue l'action de la case sur le joueur j
     *
     * @param j Joueur qui vient d'arriver sur la case
     * @param valeurDe Valeur de son lancé de dés
     * @throws NoMoreMoneyException Si le joueur ne peut pas payer un loyer
     */
    public abstract void utiliser(Joueur j, int valeurDe) throws NoMoreMoneyException;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}