package com.mycompany.monopoly;

public class Constructible extends Achetable {
    private int nbMaison;
    private int nbHotel;
    private static final int loyer = 100;
    private static final int prixMaison = 100;
    private static final int prixHotel = 1000;

    public Constructible(String nom, int prix) {
        super(prix, nom);
    }

    public int loyer() {
        int res = loyer + nbMaison * prixMaison + nbHotel * prixHotel;
        return res;
    }

    @Override
    public void utiliser(Joueur j, int valeurDe) throws NoMoreMoneyException {
        if (getProprietaire() == null) {
            if (valeurDe % 2 == 1) {
                if (j.getFortune() >= getPrix()) {
                    setProprietaire(j);
                    j.setFortune(j.getFortune() - getPrix());
                    System.out.println(j.getNom() + " achète " + this + " !");
                }
            }
        } else if (getProprietaire() != j) {
            int loyer = loyer();
            j.payer(getProprietaire(), loyer);
            System.out.println(j.getNom() + " paye le loyer de " + this.getNom() + " à " + getProprietaire().getNom() + " !");
        }
    }

    @Override
    public void faillite(Joueur j) {
        if (this.getProprietaire() == j) {
            super.faillite(j);
            this.nbMaison = 0;
            this.nbHotel = 0;
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        if (nbMaison > 0) {
            s += ", " + nbMaison + " maisons";
        }
        if (nbHotel > 0) {
            s += ", " + nbHotel + " hotels";
        }
        s += ", loyer = " + loyer() + "€";
        return s;
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public int getNbHotel() {
        return nbHotel;
    }

    public double getPrixMaison() {
        return prixMaison;
    }

    public double getPrixHotel() {
        return prixHotel;
    }

    public void ajoutMaison() {
        nbMaison += 1;
    }

    public void ajoutHotel() {
        nbHotel += 1;
    }
}
