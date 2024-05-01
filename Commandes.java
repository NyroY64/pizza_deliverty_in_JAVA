
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Commandes {
    private int idCommande;
    private Client Client;
    private Pizza Pizza;
    private note String;
    private date dateCommande;
    private String addresse;

    /**
     * Default constructor
     */
    public Commandes() {
    }

    /**
     * 
     */
    public int idCommande;

    /**
     * 
     */
    public Client Client;

    /**
     * 
     */
    public Pizza Pizza;

    /**
     * 
     */
    public String note;

    /**
     * 
     */
    public date dateDeCommande;

    /**
     * 
     */
    public String Address;

    /**
     * 
     */
    public Set<Client> listClient;


    /**
     * 
     */
    public Livraison listLivraison;

    /**
     * 
     */
    public Set<Ligne> listLigne;

}