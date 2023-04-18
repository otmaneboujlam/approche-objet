package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> setPays = new HashSet<>();

		setPays.add("USA");
		setPays.add("France");
		setPays.add("Allemagne");
		setPays.add("UK");
		setPays.add("Italie");
		setPays.add("Japon");
		setPays.add("Chine");
		setPays.add("Russie");
		setPays.add("Inde");

		Iterator<String> ite = setPays.iterator();
		String max = ite.next();
		while (ite.hasNext()) {
			String valeur = ite.next();
			if (valeur.length() > max.length()) {
				max = valeur;
			}
		}
		System.out.println(max);

		System.out.println("--------------");

		setPays.remove(max);
		for (String pays : setPays) {
			System.out.println(pays);
		}
	}

}
