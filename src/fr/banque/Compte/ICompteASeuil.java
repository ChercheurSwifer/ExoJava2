package fr.banque.Compte;

public interface ICompteASeuil
{
    public void retirer(Double unMontant);
    public Double getSeuil();
    public void setSeuil(Double seuil);
}
