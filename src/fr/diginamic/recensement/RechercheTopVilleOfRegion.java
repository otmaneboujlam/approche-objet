package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheTopVilleOfRegion extends MenuService {

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {

		System.out.println("Nom de la region sans espace : ");
		String choix = scanner.next();

		ArrayList<Ville> villesRegion = new ArrayList<>();
		for (Ville ville : recencement.getVilles()) {
			if (choix.equals(ville.getNomRegion())) {
				villesRegion.add(ville);
			}
		}

		Collections.sort(villesRegion);
		for (int i = 0; i < 10; i++) {
			System.out.println(villesRegion.get(i));
		}
	}

}
