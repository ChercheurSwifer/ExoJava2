package fr.banque;

public class Main {

    public static void main(String[] args) throws BanqueException {
        Client alexis = new Client("larochette", "alexis", 36, 25441);
        Compte cas = new CompteASeuil(124, 200000d, 100d);
        Compte cr = new CompteRemunere(352, 60000d, 0.2);
        Compte cras = new CompteASeuilRemunere(555, 60000d, 0.2, 20000d);
        alexis.ajouterCompte(cas);
        alexis.ajouterCompte(cr);
        alexis.ajouterCompte(cras);
        System.out.println("CAS");
        alexis.getCompte(124).retirer(150d);
        alexis.getCompte(124).ajouter(500d);
        System.out.println(alexis.getCompte(124).getSolde());
        alexis.getCompte(124).retirer(150d);
        System.out.println(alexis.getCompte(124).getSolde());

        System.out.println(alexis.getCompte(352).getSolde());
        CompteRemunere cr2 = (CompteRemunere) alexis.getCompte(352);
        cr2.verserInterets();
        System.out.println(alexis.getCompte(352).getSolde());

        Double solde = alexis.getCompte(555).getSolde();

        try {
            alexis.getCompte(555).retirer(600000d);
        } catch (BanqueException e) {
            e.printStackTrace();
        }
        
        System.out.println(alexis.getCompte(555).getSolde());
        CompteRemunere T = (CompteRemunere) alexis.getCompte(555);
        T.verserInterets();
        System.out.println(alexis.getCompte(555).getSolde());

    }
}
