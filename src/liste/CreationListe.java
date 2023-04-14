package liste;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {

		ArrayList<Integer> maListe = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			maListe.add(i);
		}
		System.out.println(maListe.size());
	}
}
