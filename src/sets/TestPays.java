package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> setPays = new HashSet<>();

		setPays.add(new Pays("USA", 331449281, 75179.59));
		setPays.add(new Pays("France", 68000000, 34100));
		setPays.add(new Pays("Allemagne", 84300000, 46150));
		setPays.add(new Pays("UK", 67508936, 43391));
		setPays.add(new Pays("Italie", 58983122, 45267));
		setPays.add(new Pays("Japon", 123300000, 42700));
		setPays.add(new Pays("Chine", 1410000000, 12500));
		setPays.add(new Pays("Russie", 145500000, 10661));
		setPays.add(new Pays("Inde", 1380000000, 2339));

		Iterator<Pays> ite = setPays.iterator();
		Pays maxPIBHabitant = ite.next();
		while (ite.hasNext()) {
			Pays valeur = ite.next();
			if (valeur.getPIBParHabitant() > maxPIBHabitant.getPIBParHabitant()) {
				maxPIBHabitant = valeur;
			}
		}
		System.out.println(maxPIBHabitant);

		System.out.println("----------------");

		Iterator<Pays> ite1 = setPays.iterator();
		Pays maxPIBTotal = ite1.next();
		while (ite1.hasNext()) {
			Pays valeur = ite1.next();
			if (valeur.getPIBParHabitant() * valeur.getNombreHabitants() > maxPIBTotal.getPIBParHabitant()
					* maxPIBTotal.getNombreHabitants()) {
				maxPIBTotal = valeur;
			}
		}
		System.out.println(maxPIBTotal);

		System.out.println("----------------");

		Iterator<Pays> ite2 = setPays.iterator();
		Pays minPIBTotal = ite2.next();
		while (ite2.hasNext()) {
			Pays valeur = ite2.next();
			if (valeur.getPIBParHabitant() * valeur.getNombreHabitants() < minPIBTotal.getPIBParHabitant()
					* minPIBTotal.getNombreHabitants()) {
				minPIBTotal = valeur;
			}
		}
		System.out.println(minPIBTotal);

		System.out.println("----------------");

		for (Pays pays : setPays) {
			if (pays.equals(minPIBTotal)) {
				pays.setNom(pays.getNom().toUpperCase());
			}
		}
		for (Pays pays : setPays) {
			System.out.println(pays);
		}

		System.out.println("----------------");

		setPays.remove(minPIBTotal);
		for (Pays pays : setPays) {
			System.out.println(pays);
		}
	}
}
