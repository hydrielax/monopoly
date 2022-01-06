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
        LinkedList<Joueur> liste = new LinkedList<>();
        Joueur j1 = new Joueur("JB", p, liste);
        Joueur j2 = new Joueur("Marius", p, liste);
        Joueur j3 = new Joueur("Aymeric", p, liste);
        Joueur j4 = new Joueur("Quentin", p, liste);
        Joueur j5 = new Joueur("Zijie", p, liste);
        Joueur j6 = new Joueur("Gen", p, liste);
        Joueur j7 = new Joueur("Alexis", p, liste);
        Joueur j8 = new Joueur("Otmane", p, liste);
        Joueur j9 = new Joueur("Younes", p, liste);
        Joueur j10 = new Joueur("Jorge", p, liste);
        Joueur j11 = new Joueur("Floran", p, liste);
        Joueur j12 = new Joueur("Béryl", p, liste);
        Joueur j13 = new Joueur("Xiaoteng", p, liste);
        Joueur j14 = new Joueur("Isaias", p, liste);

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

            if(p.finDePartie()) {
                System.out.println("La partie est terminée !");
                return;
            }

            System.out.println("- Tapez entrée pour continuer la partie");
            System.out.println("- Tapez 'Q' puis entrée quitter");

            in = input.nextLine();
        }
        System.out.println("Vous avez quitté");
    }
}
