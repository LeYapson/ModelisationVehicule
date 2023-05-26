// Classe représentant une voiture hybride
public class VoitureHybride extends Vehicule {
    public VoitureHybride(String marque, int kilometrage, String modele, int nombreChevauxFiscaux) {
        super(marque, kilometrage, modele, 800, nombreChevauxFiscaux);
    }

    @Override
    public void addPneu(Pneu pneu) {
        if (!(pneu instanceof PneuTouteSaison)) {
            throw new IllegalArgumentException("Une voiture hybride ne peut être équipée que de pneus toute saison.");
        }
        super.addPneu(pneu);
    }
}

