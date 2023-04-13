package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char op) {

		double result = 0;

		if (op == '+') {
			result = a + b;
		} else if (op == '-') {
			result = a - b;
		} else if (op == '*') {
			result = a * b;
		} else if (op == '/') {
			result = a / b;
		} else {
			throw new RuntimeException("Operateur inconnu");
		}

		return result;
	}
}
