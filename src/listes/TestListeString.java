package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> maListe = new ArrayList<>();

		maListe.add("Nice");
		maListe.add("Carcassonne");
		maListe.add("Narbonne");
		maListe.add("Lyon");
		maListe.add("Foix");
		maListe.add("Pau");
		maListe.add("Marseille");
		maListe.add("Tarbes");

		String maxVille = maListe.get(0);
		for (String valeur : maListe) {
			if (maxVille.length() < valeur.length()) {
				maxVille = valeur;
			}
		}
		System.out.println(maxVille);

		for (int i = 0; i < maListe.size(); i++) {
			maListe.set(i, maListe.get(i).toUpperCase());
		}

		Iterator<String> iter = maListe.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.startsWith("N")) {
				iter.remove();
			}
		}

		for (String ville : maListe) {
			System.out.println(ville);
		}
	}
}
