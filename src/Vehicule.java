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

    public String getMarque() {
        return marque;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public String getModele() {
        return modele;
    }

    public int getAutonomieMax() {
        return autonomieMax;
    }

    public List<Pneu> getListePneus() {
        return listePneus;
    }

    public int getNombreChevauxFiscaux() {
        return nombreChevauxFiscaux;
    }

    public void addPneu(Pneu pneu) {
        listePneus.add(pneu);
    }
    public void have4Wheels() {
        if(listePneus.size() != 4) {
            throw new IllegalArgumentException("Une voiture doit obligatoirement avoir 4 roues");
        }
    }
}

