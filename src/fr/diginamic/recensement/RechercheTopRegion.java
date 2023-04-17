package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheTopRegion extends MenuService {

	private ArrayList<String> regionsNomList = new ArrayList<>();
	private ArrayList<Region> regions = new ArrayList<>();

	@Override
	public void traiter(Recensement recencement, Scanner scanner) {

		for (Ville ville : recencement.getVilles()) {
			if (!regionsNomList.contains(ville.getNomRegion())) {
				regionsNomList.add(ville.getNomRegion());
			}
		}

		for (String regionNom : regionsNomList) {
			Region region = new Region(0, regionNom, 0);
			for (Ville ville : recencement.getVilles()) {
				if (regionNom.equals(ville.getNomRegion())) {
					region.setCodeRegion(ville.getCodeRegion());
					region.setPopulationRegionTotale(region.getPopulationRegionTotale() + ville.getPopulationTotale());
				}
			}
			regions.add(region);
		}

		Collections.sort(regions);

		for (int i = 0; i < 10; i++) {
			System.out.println(regions.get(i));
		}

	}

}
