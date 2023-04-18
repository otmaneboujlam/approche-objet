package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheTopDepartement extends MenuService {

	private ArrayList<String> departementCodeList = new ArrayList<>();
	private ArrayList<Departement> departements = new ArrayList<>();

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {

		for (Ville ville : recencement.getVilles()) {
			if (!departementCodeList.contains(ville.getCodeDepartement())) {
				departementCodeList.add(ville.getCodeDepartement());
			}
		}

		for (String departementNom : departementCodeList) {
			Departement departement = new Departement(0, "", departementNom, 0);
			for (Ville ville : recencement.getVilles()) {
				if (departementNom.equals(ville.getCodeDepartement())) {
					departement.setCodeRegion(ville.getCodeRegion());
					departement.setCodeDepartement(ville.getCodeDepartement());
					departement.setPopulationDepartementTotale(
							departement.getPopulationDepartementTotale() + ville.getPopulationTotale());
				}
			}
			departements.add(departement);
		}

		Collections.sort(departements);

		for (int i = 0; i < 10; i++) {
			System.out.println(departements.get(i));
		}

	}
}
