package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle cercle1 = CercleFactory.cercleFactory(2);
		Cercle cercle2 = CercleFactory.cercleFactory(3);

		System.out.println(cercle1.perimetre() + " " + cercle1.surface());
		System.out.println(cercle2.perimetre() + " " + cercle2.surface());
	}
}
