// Classe représentant une voiture essence
public class VoitureEssence extends Vehicule {
    public VoitureEssence(String marque, int kilometrage, String modele, int nombreChevauxFiscaux) {
        super(marque, kilometrage, modele, 1000, nombreChevauxFiscaux);
    }
    @Override
    public void AutonomieMax() {
        int min = 10; // Minimum value of range
        int max = 1000; // Maximum value of range
        // Generate random int value from min to max
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        // Printing the generated random numbers
        System.out.println("Autonomie de la voiture Essence en KM "+":"+random_int);
    }
}
