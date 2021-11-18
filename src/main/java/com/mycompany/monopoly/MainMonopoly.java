/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

/**
 *
 * @author Alexis Delage
 */
public class MainMonopoly{
    public static void main(String[] argv) throws NoMoreMoneyException { 
        int test = 0;
        
        Joueur j1 = new Joueur("JB");
        Joueur j2 = new Joueur("Marius");
        j1.payer(j2, 1000);
        System.out.println(j1);
        System.out.println(j2);
        
    }
}
