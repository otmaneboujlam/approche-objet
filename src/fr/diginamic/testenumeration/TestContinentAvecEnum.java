package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		ArrayList<Ville> listVille = new ArrayList<>();

		listVille.add(new Ville("New York", 8468000, Continent.AMERIQUE));
		listVille.add(new Ville("Paris", 2161000, Continent.EUROPE));
		listVille.add(new Ville("Pekin", 21540000, Continent.ASIE));
		listVille.add(new Ville("Moscou", 11980000, Continent.EUROPE));
		listVille.add(new Ville("Berlin", 3645000, Continent.EUROPE));
		listVille.add(new Ville("Sydney", 5312000, Continent.OCEANIE));
		listVille.add(new Ville("Sao Paulo", 12330000, Continent.AMERIQUE));
		listVille.add(new Ville("Dakar", 1146000, Continent.AFRIQUE));

		for (Ville ville : listVille) {
			System.out.println(ville);
		}
	}

}
