package fr.diginamic.operations;

public class CalculMoyenne {

	private double tableau[] = new double[0];

	public void ajout(double a) {
		double nvTableau[] = new double[tableau.length + 1];
		int i = 0;
		for (double valeur : tableau) {
			nvTableau[i] = valeur;
			i++;
		}
		nvTableau[tableau.length] = a;
		tableau = nvTableau;
	}

	public double calcul() {
		double moyenne = 0;
		for (double valeur : tableau) {
			moyenne = moyenne + valeur;
		}

		return moyenne / tableau.length;
	}
}
