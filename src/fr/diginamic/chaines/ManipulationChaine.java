package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractere : " + premierCaractere);

		System.out.println("Longueur de la chaine de caractères : " + chaine.length());

		System.out.println("Index du premier «;» contenu dans la chaine de caractères : " + chaine.indexOf(";"));

		System.out.println("Nom de famille : " + chaine.substring(0, chaine.indexOf(";")));

		System.out
				.println("Nom de famille en majuscules : " + (chaine.substring(0, chaine.indexOf(";")).toUpperCase()));

		System.out
				.println("Nom de famille en minuscules : " + (chaine.substring(0, chaine.indexOf(";")).toLowerCase()));

		String tableau[];
		tableau = chaine.split(";");
		for (String valeur : tableau) {
			System.out.println(valeur);
		}

		Salarie salarie1 = new Salarie(tableau[0], tableau[1], Double.parseDouble(tableau[2].replace(" ", "")));
		System.out.println(salarie1);

	}

}
