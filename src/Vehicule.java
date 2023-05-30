import java.util.ArrayList;
import java.util.List;

// Classe abstraite représentant un véhicule
public abstract class Vehicule {
    private String marque;
    private int kilometrage;
    private String modele;
    private int autonomieMax;
    private List<Pneu> listePneus;
    private int nombreChevauxFiscaux;

    public Vehicule(String marque, int kilometrage, String modele, int autonomieMax, int nombreChevauxFiscaux) {
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.modele = modele;
        this.autonomieMax = autonomieMax;
        this.listePneus = new ArrayList<>();
        this.nombreChevauxFiscaux = nombreChevauxFiscaux;
    }

    public int getAutonomieMax() {
        return autonomieMax;
    }

    public int getNombreChevauxFiscaux() {
        return nombreChevauxFiscaux;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public String getMarque() {
        return marque;
    }

    // génération du kilométrage de manière aléatoire
    public void Kilometrage() {
        int min = 0; // Minimum value of range
        int max = 400000; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println("Kilometrage de la voiture "+":"+random_int);
    }

    public String getModele() {
        return modele;
    }

    // génération de l'autonomie max du véhicule aléatoirement
    public void AutonomieMax() {
        int min = 10; // Minimum value of range
        int max = 800; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println("Autonomie de la voiture en KM"+":"+random_int);
    }

    public List<Pneu> getListePneus() {
        return listePneus;
    }

    // génération des Chevaux fiscaux du véhicule aléatoirement
    public void NombreChevauxFiscaux() {
        int min = 2; // Minimum value of range
        int max = 50; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println("Nombre de chevaux Fiscaux de la voiture "+":"+random_int);
    }

    public void addPneu(Pneu pneu) {
        listePneus.add(pneu);
    }

    //Cette méthode vérifie si le véhicule a bien 4 roues, renvoie une erreur si le véhicule n'a pas exactement 4 roues
    public void have4Wheels() {
        if(listePneus.size() != 4) {
            throw new IllegalArgumentException("Une voiture doit obligatoirement avoir 4 roues");
        }
    }
}

