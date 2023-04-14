package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> maListe = new ArrayList<>();

		maListe.add(-1);
		maListe.add(5);
		maListe.add(7);
		maListe.add(3);
		maListe.add(-2);
		maListe.add(4);
		maListe.add(8);
		maListe.add(5);

		for (int valeur : maListe) {
			System.out.println(valeur);
		}

		int max = maListe.get(0);
		for (int valeur : maListe) {
			if (max < valeur) {
				max = valeur;
			}
		}
		System.out.println(max);

		int indexMin = 0;
		for (int i = 1; i < maListe.size(); i++) {
			if (maListe.get(indexMin) > maListe.get(i)) {
				indexMin = i;
			}
		}
		System.out.println(maListe.get(indexMin));
		maListe.remove(indexMin);

		for (int i = 0; i < maListe.size(); i++) {
			if (maListe.get(i) < 0) {
				maListe.set(i, -maListe.get(i));
			}
		}

		for (int valeur : maListe) {
			System.out.println(valeur);
		}
	}
}
