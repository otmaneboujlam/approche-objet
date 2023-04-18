package maps;

import java.util.HashMap;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {

		HashMap<String, Ville> mapVilles = new HashMap<>();

		mapVilles.put("Nice", new Ville("Nice", 343000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
		mapVilles.put("Lyon", new Ville("Lyon", 484000));
		mapVilles.put("Foix", new Ville("Foix", 9700));
		mapVilles.put("Pau", new Ville("Pau", 77200));
		mapVilles.put("Marseille", new Ville("Marseille", 850700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

		String keyVilleMin = mapVilles.keySet().iterator().next();
		for (String key : mapVilles.keySet()) {
			if (mapVilles.get(keyVilleMin).getNombreHabitants() > mapVilles.get(key).getNombreHabitants()) {
				keyVilleMin = key;
			}
		}

		mapVilles.remove(keyVilleMin);
		for (String key : mapVilles.keySet()) {
			System.out.println(mapVilles.get(key));
		}
	}

}
