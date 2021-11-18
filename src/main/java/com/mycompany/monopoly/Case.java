/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

import com.mycompany.monopoly.exceptions.NoMoreMoneyException;

/**
 *
 * @author youne
 */
public abstract class Case {
    private String nom;

    public Case(String nom) {
        this.nom = nom;
    }
    public abstract void utiliser(Joueur j) throws NoMoreMoneyException;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
