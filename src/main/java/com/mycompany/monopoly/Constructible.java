/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopoly;

/**
 *
 * @author youne
 */
public class Constructible extends Achetable{
    private int nbMaison;
    private int nbHotel;
    private int prixMaison;
    private int prixHotel;
    

    public void faillite(Joueur j){
        if(this.proprietaire == j){
            super.faillite(j);
            this.nbMaison = 0;
            this.nbHotel = 0;
        }
    }
}
