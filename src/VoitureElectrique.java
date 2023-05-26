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
}
