package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

		System.out.println(Operations.calcul(14, 3, '+'));
		System.out.println(Operations.calcul(14, 3, '-'));
		System.out.println(Operations.calcul(14, 3, '*'));
		System.out.println(Operations.calcul(14, 3, '/'));
		Operations.calcul(14, 3, 't');
	}

}
