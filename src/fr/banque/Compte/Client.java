//region Client
package fr.banque.Compte;

import java.util.Arrays;

public class Client extends Compte {
    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private Compte[] cpt = new Compte[5];


    public Client(double solde, int numero, String nom, String prenom, int age, int numero1) {
        super(solde, numero);
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero1;
    }

    public Client(String larochette, String alexis, int i, int i1) {

    }


    /*
    Permet d'ajouter un compte a nos client

     */
    public void ajouterCompte(Compte unCompte)
    {
        Boolean addCpt = false;

        for (int i=0; i < cpt.length; i++)
        {
            if(this.cpt[i] == null) {
                this.cpt[i] = unCompte;
                addCpt = true;
                break;
            }
        }
        if(!addCpt == addCpt){
            System.out.println("Vous avez le max de compte");
        }
    }

    /*
            Permet de retourner un compte
     */

    public Compte getCompte(int numeroCompte)
    {
        Compte cptcopy = null;
        for(Compte compte : this.getCpt())
        {
            if(compte.getNumero() == numeroCompte)
            {
                cptcopy = compte;
                break;
            }
        }
        if (cptcopy == null)
        {
            System.out.println("Compte inconnu");
        }
        return cpt[numeroCompte];
    }



    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", cpt=" + Arrays.toString(cpt) +
                '}';
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Compte[] getCpt() {
        return cpt;
    }

    public void setCpt(Compte[] cpt) {
        this.cpt = cpt;
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
//endregion
