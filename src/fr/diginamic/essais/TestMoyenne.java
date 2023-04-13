package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne calculMoyenne = new CalculMoyenne();

		calculMoyenne.ajout(1);

		System.out.println(calculMoyenne.calcul());

		calculMoyenne.ajout(2);

		System.out.println(calculMoyenne.calcul());

		calculMoyenne.ajout(4);

		System.out.println(calculMoyenne.calcul());
	}

}
