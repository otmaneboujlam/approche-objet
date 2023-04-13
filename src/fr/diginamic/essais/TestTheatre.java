package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre capitole = new Theatre("Capitole", 500);

		capitole.inscrire(100, 10);
		System.out.println(capitole.getNom() + " " + capitole.getCapaciteMax() + " " + capitole.getClientsInscrits()
				+ " " + capitole.getRecetteTotale());

		capitole.inscrire(200, 8);
		System.out.println(capitole.getNom() + " " + capitole.getCapaciteMax() + " " + capitole.getClientsInscrits()
				+ " " + capitole.getRecetteTotale());

		capitole.inscrire(150, 9);
		System.out.println(capitole.getNom() + " " + capitole.getCapaciteMax() + " " + capitole.getClientsInscrits()
				+ " " + capitole.getRecetteTotale());

		capitole.inscrire(48, 10);
		System.out.println(capitole.getNom() + " " + capitole.getCapaciteMax() + " " + capitole.getClientsInscrits()
				+ " " + capitole.getRecetteTotale());

		capitole.inscrire(3, 10);
		System.out.println(capitole.getNom() + " " + capitole.getCapaciteMax() + " " + capitole.getClientsInscrits()
				+ " " + capitole.getRecetteTotale());
	}

}
