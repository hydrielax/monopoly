/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;
import java.util.LinkedList;

import java.util.Scanner;

/**
 *
 * @author Alexis Delage
 */
public class MainMonopoly{
    public static void main(String[] argv) throws NoMoreMoneyException {
        Joueur j1 = new Joueur("JB");
        Joueur j2 = new Joueur("Marius");
        j1.payer(j2, 1000);
        System.out.println(j1);
        System.out.println(j2);

        Plateau plateau = new Plateau();
        plateau.initPlateau(); //TODO joueur

        Scanner input = new Scanner(System.in);
        System.out.println("- Appuyez sur entrée pour continuer la partie");
        System.out.println("- Appuyez sur 'Q' puis entrée quitter");
        String in = input.nextLine();
        while (!in.equals("Q")) {
            plateau.tourDeJeu();
            plateau.affiche();

            System.out.println("- Appuyez sur entrée pour continuer la partie");
            System.out.println("- Appuyez sur 'Q' puis entrée quitter");

            in = input.nextLine();
        }
        System.out.println("Vous avez quitté");
        LinkedList<Joueur> liste = new LinkedList();
        liste.add(j1);
        liste.add(j2);
        Plateau p = new Plateau();
        p.initPlateau(liste);

    }
}
