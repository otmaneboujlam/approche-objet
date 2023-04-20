package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison tabelauSaison[] = Saison.values();
		for (int i = 0; i < tabelauSaison.length; i++) {
			System.out.println(tabelauSaison[i]);
		}

		String nomSaison = "ETE";
		System.out.println(Saison.valueOf(nomSaison).getLibelle());

		String libelle = "Hiver";
		System.out.println(Saison.trouverInstance(libelle));
		System.out.println(Saison.trouverInstance("Hive"));
		System.out.println(Saison.trouverInstance(""));
		System.out.println(Saison.trouverInstance(null));
	}

}
