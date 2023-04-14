package listes;

import java.util.ArrayList;

public class TestVille {

	public static void main(String[] args) {

		ArrayList<Ville> listeVille = new ArrayList<>();

		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));

		Ville maxVille = listeVille.get(0);
		for (Ville ville : listeVille) {
			if (maxVille.getNombreHabitants() < ville.getNombreHabitants()) {
				maxVille = ville;
			}
		}
		System.out.println(maxVille);

		int indexMinVille = 0;
		for (int i = 1; i < listeVille.size(); i++) {
			if (listeVille.get(indexMinVille).getNombreHabitants() > listeVille.get(i).getNombreHabitants()) {
				indexMinVille = i;
			}
		}
		System.out.println(listeVille.get(indexMinVille));
		listeVille.remove(indexMinVille);

		for (Ville ville : listeVille) {
			if (ville.getNombreHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}

		for (Ville ville : listeVille) {
			System.out.println(ville);
		}
	}
}
