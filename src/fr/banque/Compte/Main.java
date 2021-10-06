package fr.banque.Compte;

public class Main {

    public static void main(String[] args) {
        Client antoine = new Client("Alexis", "L", 36, 25441);
        Compte cas = new CompteASeuil(124, 200d, 100d);
        Compte cr = new CompteRemunere(352, 60000d, 0.2);
        antoine.ajouterCompte(cas);
        antoine.ajouterCompte(cr);

        System.out.println("CAS");
        antoine.getCompte(124).retirer(150d);
        antoine.getCompte(124).ajouter(500d);
        System.out.println(antoine.getCompte(124).getSolde());
        antoine.getCompte(124).retirer(150d);
        System.out.println(antoine.getCompte(124).getSolde());

        System.out.println(antoine.getCompte(352).getSolde());
        CompteRemunere cr2 = (CompteRemunere) antoine.getCompte(352);
        cr2.verserInterets();
        System.out.println(antoine.getCompte(352).getSolde());
        CompteASeuilRenumere casr = new CompteASeuilRenumere(455,15000d,8000d,6000d);
        casr.calculerInterets();
        System.out.println(casr.calculerInterets());


    }
}
