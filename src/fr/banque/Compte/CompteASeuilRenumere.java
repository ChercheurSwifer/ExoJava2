package fr.banque.Compte;

public class CompteASeuilRenumere extends CompteASeuil implements ICompteRemunere
{
    private Double seuil;

    public CompteASeuilRenumere(Integer numero, Double solde, Double seuil, Double seuil1) {
        super(numero, solde, seuil);
        this.seuil = seuil1;
    }

    @Override
    public double calculerInterets() {
        return this.getTaux()*this.getSolde();
    }

    @Override
    public void verserInterets() {
        this.ajouter(this.calculerInterets());
    }

    @Override
    public Double getTaux() {
       return this.seuil;
    }

    @Override
    public void setTaux(Double unTaux) {
        this.seuil = unTaux;
    }
}
