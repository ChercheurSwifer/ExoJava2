package fr.banque.Compte;

public class Client extends Compte {
    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private Compte[] cpt;


    public Client(double solde, int numero, String nom, String prenom, int age, int numero1, Compte[] cpt) {
        super(solde, numero);
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero1;
        this.cpt = cpt;
    }

    public Client() {

    }

    public void ajouterCompte(Compte unCompte)
    {
        numero +=1;
        cpt[unCompte.getNumero()] = new Compte();
    }

    public Compte getCompte(int numeroCompte)
    {
        return cpt[numeroCompte];
    }




    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                '}';
    }

    /*
            GETTER ET SETTER
    */

    public Compte[] getCpt() {
        return cpt;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
