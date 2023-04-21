package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		long debut = System.currentTimeMillis();
		for (int i = 1; i < 100001; i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

		String chaine = "";
		debut = System.currentTimeMillis();
		for (int i = 1; i < 100001; i++) {
			chaine += i;
		}
		fin = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

	}

}
