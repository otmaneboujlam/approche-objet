package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {
		System.out.println("Nom de la ville sans espace : ");
		String choix = scanner.next();
		for (Ville ville : recencement.getVilles()) {
			if (ville.getNomCommune().equals(choix)) {
				System.out.println(ville.getPopulationTotale());
				break;
			}
		}
	}

}
