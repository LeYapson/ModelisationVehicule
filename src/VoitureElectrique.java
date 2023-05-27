// Classe représentant une voiture électrique
public class VoitureElectrique extends Vehicule {
    public VoitureElectrique(String marque, int kilometrage, String modele, int nombreChevauxFiscaux) {
        super(marque, kilometrage, modele, 500, nombreChevauxFiscaux);
    }

    @Override
    public void addPneu(Pneu pneu) {
        if (pneu instanceof PneuHiver) {
            throw new IllegalArgumentException("Une voiture électrique ne peut pas être équipée de pneus hiver.");
        }
        super.addPneu(pneu);
    }
    @Override
    public void AutonomieMax() {
        int min = 10; // Minimum value of range
        int max = 500; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println("Autonomie de la voiture Electique en KM"+":"+random_int);
    }
}
