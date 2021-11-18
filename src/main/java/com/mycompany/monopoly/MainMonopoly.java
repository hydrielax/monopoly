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
        Plateau p = new Plateau();
        Joueur j1 = new Joueur("JB", p);
        Joueur j2 = new Joueur("Marius", p);

        LinkedList<Joueur> liste = new LinkedList<>();
        liste.add(j1);
        liste.add(j2);
        p.initPlateau(liste);

        Scanner input = new Scanner(System.in);
        System.out.println("Début de la partie !");
        System.out.println("");
        String in = "";
        while (!in.equals("Q")) {
            System.out.println("Actions des joueurs :");

            p.tourDeJeu();

            System.out.println("===================");

            p.affiche();

            System.out.println("- Tapez entrée pour continuer la partie");
            System.out.println("- Tapez 'Q' puis entrée quitter");

            in = input.nextLine();
        }
        System.out.println("Vous avez quitté");

    }
}
