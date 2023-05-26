public class Main {
    public static void main(String[] args) {
        try {
            VoitureElectrique voitureElectrique = new VoitureElectrique("Tesla", 0, "Model S", 150);
            voitureElectrique.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.6));
            voitureElectrique.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.9));  // Génère une exception : indice d'adhérence incorrect pour un pneu été
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            VoitureHybride voitureHybride = new VoitureHybride("Toyota", 50000, "Prius", 100);
            voitureHybride.addPneu(new PneuTouteSaison("Continental", 195, 91, "01/2022", 0.3));
            voitureHybride.addPneu(new PneuHiver("Michelin", 195, 91, "01/2022", 0.8));  // Génère une exception : un pneu hiver ne peut pas être ajouté à une voiture hybride
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Création d'autres instances de véhicules et de pneus pour les tests
        VoitureDiesel voitureDiesel = new VoitureDiesel("Volkswagen", 100000, "Golf", 120);
        VoitureEssence voitureEssence = new VoitureEssence("Ford", 80000, "Focus", 110);
        PneuEte pneuEte = new PneuEte("Pirelli", 195, 90, "01/2023", 0.5);
        PneuHiver pneuHiver = new PneuHiver("Michelin", 205, 95, "01/2022", 0.9);
        PneuTouteSaison pneuTouteSaison = new PneuTouteSaison("Goodyear", 195, 91, "01/2023", 0.3);

        // Tests supplémentaires
        voitureDiesel.addPneu(pneuEte);  // Ajout d'un pneu été à une voiture diesel
        voitureDiesel.addPneu(pneuEte);  // Ajout d'un pneu été à une voiture diesel
        voitureDiesel.addPneu(pneuEte);  // Ajout d'un pneu été à une voiture diesel
        voitureDiesel.addPneu(pneuEte);  // Ajout d'un pneu été à une voiture diesel
        voitureEssence.addPneu(pneuHiver);  // Ajout d'un pneu hiver à une voiture essence (ne génère pas d'exception car pas de contrainte spécifique)
        voitureEssence.addPneu(pneuTouteSaison);  // Ajout d'un pneu toute saison à une voiture essence
        voitureEssence.addPneu(pneuHiver);  // Ajout d'un pneu hiver à une voiture essence (ne génère pas d'exception car pas de contrainte spécifique)
        voitureEssence.addPneu(pneuTouteSaison);  // Ajout d'un pneu toute saison à une voiture essence

        voitureEssence.have4Wheels();
        voitureDiesel.have4Wheels();
        System.out.println("Marque de la voiture diesel : " + voitureDiesel.getMarque());
        System.out.println("Nombre de pneus de la voiture diesel : " + voitureDiesel.getListePneus().size());
        System.out.println("Marque du pneu ajouté : " + voitureDiesel.getListePneus().get(0).getMarque());
        System.out.println("");
        System.out.println("Marque de la voiture essence : " + voitureEssence.getMarque());
        System.out.println("Nombre de pneus de la voiture essence : " + voitureEssence.getListePneus().size());
        System.out.println("Marque du pneu ajouté : " + voitureEssence.getListePneus().get(0).getMarque());
    }
}