package fr.banque.Compte;

public interface ICompteRemunere
{
    public double calculerInterets();
    public void verserInterets();
    public Double getTaux();
    public void setTaux(Double unTaux);
}
