package fr.banque.Compte;

public class Main {

    public static void main(String[] args) {
	    Compte cpt = new Compte();
        cpt.setSolde(500.0);
        System.out.println(cpt.toString());

        Client clt = new Client();
//        clt.ajouterCompte(1);
        clt.setSolde(0);
        clt.ajouter(300);


    }
}
