
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private int age;
    private String numTel;
    private String addresse;
    private int nbCommandes;

    //Constructer_1
    public Client(int idClient ,String nom, String prenom, int age, String numTel, String addresse, int nbCommandes) {
        this.idClient= idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numTel= numTel;
        this.addresse = addresse;
        this.nbCommandes=nbCommandes;
    }

       //Constructer_02 (nbCommandes initialiser a 0)
       public Client(int idClient ,String nom, String prenom, int age, String numTel, String addresse) {
        this.idClient= idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numTel= numTel;
        this.addresse = addresse;
        this.nbCommandes=0;
    }


    //Getters pour les attributs de la classe

    public int getIdClient() {
        return idClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getNumTel() {
        return numTel;
    }

    public int getNbCommandes() {
        return nbCommandes;
    }

    //Getters pour les attributs de la classe

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public void setNbCommandes(int nbCommandes) {
        this.nbCommandes = nbCommandes;
    }

    

}