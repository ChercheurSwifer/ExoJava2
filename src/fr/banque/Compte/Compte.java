package fr.banque.Compte;

public class Compte
{
    private double solde;
    private int numero;

    public Compte()
    {

    }

    public Compte(double solde, int numero) {
        this.solde = solde;
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public void ajouter(double UnMontant)
    {
        this.solde = solde + UnMontant;
    }

    public void retirer(double UnMontant)
    {
        this.solde = solde - UnMontant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + this.getSolde() +
                ", numero=" + this.getNumero() +
                '}';
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
