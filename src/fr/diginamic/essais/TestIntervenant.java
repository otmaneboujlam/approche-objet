package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie personne1 = new Salarie("Dupond", "Marcel", 1750);
		Pigiste personne2 = new Pigiste("Benzema", "Karim", 5, 100);

		System.out.println(personne1.getSalaire());
		System.out.println(personne2.getSalaire());

		System.out.println(personne1);
		System.out.println(personne2);

		personne1.afficherDonnees();
		personne2.afficherDonnees();
	}
}
