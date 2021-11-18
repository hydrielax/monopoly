/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;
import java.util.LinkedList;

/**
 *
 * @author Alexis Delage
 */
public class MainMonopoly{
    public static void main(String[] argv) throws NoMoreMoneyException { 
        Joueur j1 = new Joueur("JB");
        Joueur j2 = new Joueur("Marius");
        LinkedList<Joueur> liste = new LinkedList();
        liste.add(j1);
        liste.add(j2);
        Plateau p = new Plateau();
        p.initPlateau(liste);
        
    }
}
