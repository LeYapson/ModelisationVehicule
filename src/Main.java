public class Main {
    public static void main(String[] args) {
        // test sur un véhicule électrique
        try {
            VoitureElectrique voitureElectrique = new VoitureElectrique("Tesla", 0, "Model S", 150);
            voitureElectrique.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.6));
            voitureElectrique.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.9));  // Génère une exception : indice d'adhérence incorrect pour un pneu été
            voitureElectrique.have4Wheels();
            System.out.println("Marque de la voiture electrique : " + voitureElectrique.getMarque()+ " " + voitureElectrique.getModele());
            System.out.println("Nombre de pneus de la voiture electrique : " + voitureElectrique.getListePneus().size());
            System.out.println("Marque du pneu ajouté : " + voitureElectrique.getListePneus().get(0).getMarque());
            voitureElectrique.Kilometrage();
            voitureElectrique.NombreChevauxFiscaux();
            voitureElectrique.AutonomieMax();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        // test sur un véhicule hybride
        try {
            VoitureHybride voitureHybride = new VoitureHybride("Toyota", 50000, "Prius", 100);
            voitureHybride.addPneu(new PneuTouteSaison("Continental", 195, 91, "01/2022", 0.3));
            voitureHybride.addPneu(new PneuHiver("Michelin", 195, 91, "01/2022", 0.8));  // Génère une exception : un pneu hiver ne peut pas être ajouté à une voiture hybride
            voitureHybride.have4Wheels();
            System.out.println("Marque de la voiture Hybride : " + voitureHybride.getMarque() + " " + voitureHybride.getModele());
            System.out.println("Nombre de pneus de la voiture hybride : " + voitureHybride.getListePneus().size());
            System.out.println("Marque du pneu ajouté : " + voitureHybride.getListePneus().get(0).getMarque());
            voitureHybride.Kilometrage();
            voitureHybride.NombreChevauxFiscaux();
            voitureHybride.AutonomieMax();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());

        }

        // test sur un véhicule diesel
        try {
            VoitureDiesel voitureDiesel = new VoitureDiesel("Volkswagen", 100000, "Golf", 120);
            voitureDiesel.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.6));  // Ajout d'un pneu été à une voiture diesel
            voitureDiesel.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.6));  // Ajout d'un pneu été à une voiture diesel
            voitureDiesel.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.6));  // Ajout d'un pneu été à une voiture diesel
            //voitureDiesel.addPneu(new PneuEte("Michelin", 205, 95, "01/2023", 0.6));  // Ajout d'un pneu été à une voiture diesel
            voitureDiesel.have4Wheels();
            System.out.println("Marque de la voiture diesel : " + voitureDiesel.getMarque() + " " + voitureDiesel.getModele());
            System.out.println("Nombre de pneus de la voiture diesel : " + voitureDiesel.getListePneus().size());
            System.out.println("Marque du pneu ajouté : " + voitureDiesel.getListePneus().get(0).getMarque());
            voitureDiesel.Kilometrage();
            voitureDiesel.NombreChevauxFiscaux();
            voitureDiesel.AutonomieMax();
        }catch (IllegalArgumentException e) {
            System.out.println("Erreur : "+ e.getMessage());
        }

        // test sur un véhicule essence
        try {
            VoitureEssence voitureEssence = new VoitureEssence("Ford", 80000, "Focus", 110);
            voitureEssence.addPneu(new PneuTouteSaison("Continental", 195, 91, "01/2022", 0.3));
            voitureEssence.addPneu(new PneuTouteSaison("Continental", 195, 91, "01/2022", 0.3));
            voitureEssence.addPneu(new PneuTouteSaison("Continental", 195, 91, "01/2022", 0.3));
            voitureEssence.addPneu(new PneuTouteSaison("Continental", 195, 91, "01/2022", 0.3));
            voitureEssence.have4Wheels();
            System.out.println("Marque de la voiture essence : " + voitureEssence.getMarque() + " " + voitureEssence.getModele());
            System.out.println("Nombre de pneus de la voiture essence : " + voitureEssence.getListePneus().size());
            System.out.println("Marque du pneu ajouté : " + voitureEssence.getListePneus().get(0).getMarque());
            voitureEssence.Kilometrage();
            voitureEssence.NombreChevauxFiscaux();
            voitureEssence.AutonomieMax();
        }catch (IllegalArgumentException e) {
            System.out.println("Erreur : "+ e.getMessage());
        }

    }
}