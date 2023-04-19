package listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville ville1 = new Ville("Nice", 343000);

		Ville ville5 = new Ville("Nice", 343000);
		Ville ville6 = new Ville("Carcassonne", 343000);
		Ville ville7 = new Ville("Nice", 53400);
		Ville ville8 = new Ville("Lyon", 484000);
		Ville ville9 = new Ville(null, 484000);

		System.out.println(ville1.equals(ville5));
		System.out.println(ville1.equals(ville6));
		System.out.println(ville1.equals(ville7));
		System.out.println(ville1.equals(ville8));
		System.out.println(ville1 == ville5);
		System.out.println(ville1 == ville6);
		System.out.println(ville1 == ville1);
		System.out.println(ville1.equals(ville9));
		// System.out.println(ville9.equals(ville1));
	}

}
