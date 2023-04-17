package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {
		System.out.println("Nom de la region sans espace : ");
		String choix = scanner.next();
		int populationRegion = 0;
		for (Ville ville : recencement.getVilles()) {
			if (ville.getNomRegion().equals(choix)) {
				populationRegion = populationRegion + ville.getPopulationTotale();
			}
		}
		System.out.println(populationRegion);

	}

}
