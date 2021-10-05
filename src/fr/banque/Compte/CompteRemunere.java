package fr.banque.Compte;

public class CompteRemunere extends Compte
{
    private Double taux = 0.0;

    public CompteRemunere() {

    }

    public CompteRemunere(double solde, int numero, Double taux) {
        super(solde, numero);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "taux=" + taux +
                '}';
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public double calculerInterets()
    {
        return this.taux * this.getSolde();
    }

    public void verserInterets()
    {
        this.ajouter(getSolde() + calculerInterets());
    }

}
