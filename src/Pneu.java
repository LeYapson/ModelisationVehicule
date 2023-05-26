// Classe abstraite représentant un pneu
public abstract class Pneu {
    private String marque;
    private int largeur;
    private int indiceCharge;
    private String dateProduction;
    private double indiceAdherence;

    public Pneu(String marque, int largeur, int indiceCharge, String dateProduction, double indiceAdherence) {
        this.marque = marque;
        this.largeur = largeur;
        this.indiceCharge = indiceCharge;
        this.dateProduction = dateProduction;
        this.indiceAdherence = indiceAdherence;
    }

    public String getMarque() {
        return marque;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getIndiceCharge() {
        return indiceCharge;
    }

    public String getDateProduction() {
        return dateProduction;
    }

    public double getIndiceAdherence() {
        return indiceAdherence;
    }
}
