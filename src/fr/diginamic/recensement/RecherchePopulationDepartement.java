package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {
		System.out.println("Code du departement : ");
		String choix = scanner.next();
		int populationDepartement = 0;
		for (Ville ville : recencement.getVilles()) {
			if (ville.getCodeDepartement().equals(choix)) {
				populationDepartement = populationDepartement + ville.getPopulationTotale();
			}
		}
		System.out.println(populationDepartement);
	}

}
