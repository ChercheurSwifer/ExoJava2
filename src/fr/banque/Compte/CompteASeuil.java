package fr.banque.Compte;

import fr.banque.Compte.Compte;

public class CompteASeuil extends Compte
{
    private Double seuil;
    // --------------------------------------- REGION GLOBAL CLASS fr.banque.Compte.CompteASeuil

    //region CONSTRUCTEUR

    public CompteASeuil() {

    }

    public CompteASeuil(double solde, int numero, Double seuil) {
        super(solde, numero);
        this.seuil = seuil;
    }

    //endregion

    //region GETTER ET SETTER

    public Double getSeuil() {
        return seuil;
    }

    public void setSeuil(Double seuil) {
        this.seuil = seuil;
    }

    //endregion

    //region TO STRING

    @Override
    public String toString() {
        return "fr.banque.Compte.CompteASeuil{" +
                "seuil=" + seuil +
                '}';
    }

    //endregion

    //region FONCTIONS

    public void retirer(double unMontant)
    {
        if(this.getSolde() - unMontant > this.seuil) {
            setSolde(this.getSolde()- unMontant);
        }
        else
        {
            System.out.println("Impossible de retirer ! SEUIL Atteint ");
        }
    }

    //endregion

    // ---------------------------------------
}
