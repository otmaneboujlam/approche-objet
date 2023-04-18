package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> setDouble = new HashSet<>();
		setDouble.add(1.5);
		setDouble.add(8.25);
		setDouble.add(-7.32);
		setDouble.add(13.3);
		setDouble.add(-12.45);
		setDouble.add(48.5);
		setDouble.add(0.01);

		for (double nombre : setDouble) {
			System.out.println(nombre);
		}

		System.out.println("----------");

		Iterator<Double> ite = setDouble.iterator();
		double max = ite.next();
		while (ite.hasNext()) {
			double valeur = ite.next();
			if (valeur > max) {
				max = valeur;
			}
		}
		System.out.println(max);

		System.out.println("----------");

		Iterator<Double> ite1 = setDouble.iterator();
		double min = ite1.next();
		while (ite1.hasNext()) {
			double valeur = ite1.next();
			if (valeur < min) {
				min = valeur;
			}
		}
		System.out.println(min);
		setDouble.remove(min);

		System.out.println("----------");

		for (double nombre : setDouble) {
			System.out.println(nombre);
		}
	}

}
