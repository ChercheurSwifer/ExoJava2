package fr.banque.Compte;

public class CompteRemunere extends Compte implements ICompteRemunere {
    private Double taux;

    public CompteRemunere() {
    }

    public CompteRemunere(Integer numero, Double solde, Double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    @Override
    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        if (taux >= 0 && taux <= 1) {
            this.taux = taux;
        } else {
            System.out.println("taux incorrect");
        }
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "numero=" + this.getNumero() +
                ", solde=" + this.getSolde() +
                ", taux=" + taux +
                '}';
    }

    public double calculerInterets() {
        return this.getTaux()*this.getSolde();
    }

    public void verserInterets() {
        this.ajouter(this.calculerInterets());
    }


}
