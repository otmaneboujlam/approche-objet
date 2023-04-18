package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> listPays = new ArrayList<>();
		listPays.add(new Pays("France", 65000000, "Europe"));
		listPays.add(new Pays("Allemagne", 80000000, "Europe"));
		listPays.add(new Pays("Belgique", 10000000, "Europe"));
		listPays.add(new Pays("Russie", 150000000, "Asie"));
		listPays.add(new Pays("Chine", 1400000000, "Asie"));
		listPays.add(new Pays("Indonesie", 220000000, "Oceanie"));
		listPays.add(new Pays("Australie", 20000000, "Oceanie"));

		HashMap<String, Integer> mapContinent = new HashMap<>();

		for (Pays pays : listPays) {
			mapContinent.put(pays.getContinent(), 0);
		}

		for (String continent : mapContinent.keySet()) {
			for (Pays pays : listPays) {
				if (continent.equals(pays.getContinent())) {
					mapContinent.put(continent, mapContinent.get(continent) + 1);
				}
			}
		}

		for (String continent : mapContinent.keySet()) {
			System.out.println(continent + " : " + mapContinent.get(continent));
		}
	}

}
