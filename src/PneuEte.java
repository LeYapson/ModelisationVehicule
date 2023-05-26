// Classe représentant un pneu été
public class PneuEte extends Pneu {
    public PneuEte(String marque, int largeur, int indiceCharge, String dateProduction, double indiceAdherence) {
        super(marque, largeur, indiceCharge, dateProduction, indiceAdherence);
        if (indiceAdherence >= 0.7 || indiceAdherence < 0.4) {
            throw new IllegalArgumentException("L'indice d'adhérence d'un pneu été doit être compris entre 0.4 (non inclus) et 0.7 (inclus).");
        }
    }
}