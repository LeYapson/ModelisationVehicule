// Classe représentant un pneu toutes saisons
public class PneuTouteSaison extends Pneu {
    public PneuTouteSaison(String marque, int largeur, int indiceCharge, String dateProduction, double indiceAdherence) {
        super(marque, largeur, indiceCharge, dateProduction, indiceAdherence);
        if (indiceAdherence <= 0.1 || indiceAdherence >= 0.4) {
            throw new IllegalArgumentException("L'indice d'adhérence d'un pneu toute saison doit être compris entre 0.1 (non inclus) et 0.4 (non inclus).");
        }
    }
}