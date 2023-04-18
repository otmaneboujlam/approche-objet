package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheTopVilleOfDepartement extends MenuService {

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {

		System.out.println("Code du departement : ");
		String choix = scanner.next();

		ArrayList<Ville> villesDepartement = new ArrayList<>();
		for (Ville ville : recencement.getVilles()) {
			if (choix.equals(ville.getCodeDepartement())) {
				villesDepartement.add(ville);
			}
		}

		Collections.sort(villesDepartement);
		for (int i = 0; i < 10; i++) {
			System.out.println(villesDepartement.get(i));
		}
	}

}
