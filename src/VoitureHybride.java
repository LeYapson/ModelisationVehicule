// Classe représentant une voiture hybride
public class VoitureHybride extends Vehicule {
    public VoitureHybride(String marque, int kilometrage, String modele, int nombreChevauxFiscaux) {
        super(marque, kilometrage, modele, 800, nombreChevauxFiscaux);
    }

    // override de addPneu du véhicule selon ses restrictions
    @Override
    public void addPneu(Pneu pneu) {
        if (!(pneu instanceof PneuTouteSaison)) {
            throw new IllegalArgumentException("Une voiture hybride ne peut être équipée que de pneus toute saison.");
        }
        super.addPneu(pneu);
    }

    // override de l'autonomie max du véhicule selon ses restrictions
    @Override
    public void AutonomieMax() {
        int min = 10; // Minimum value of range
        int max = 800; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println("Autonomie de la voiture Hybride en KM"+":"+random_int);
    }
}

