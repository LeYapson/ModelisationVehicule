// Classe représentant un pneu hiver
public class PneuHiver extends Pneu {
    public PneuHiver(String marque, int largeur, int indiceCharge, String dateProduction, double indiceAdherence) {
        super(marque, largeur, indiceCharge, dateProduction, indiceAdherence);
        if (indiceAdherence < 0.7 || indiceAdherence > 1) {
            throw new IllegalArgumentException("L'indice d'adhérence d'un pneu hiver doit être compris entre 0.7 (inclus) et 1 (inclus).");
        }
    }
}