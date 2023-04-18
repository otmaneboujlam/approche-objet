package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

public class RechercheTopVilleOfFrance extends MenuService {

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {

		Collections.sort(recencement.getVilles());
		for (int i = 0; i < 10; i++) {
			System.out.println(recencement.getVilles().get(i));
		}
	}

}
