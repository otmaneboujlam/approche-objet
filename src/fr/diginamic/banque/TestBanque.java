package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte tableauCompte[] = new Compte[2];
		tableauCompte[0] = new Compte("A001", 100d);
		tableauCompte[1] = new CompteTaux("A002", 200d, 2f);

		for (Compte compte : tableauCompte) {
			System.out.println(compte);
		}
	}

}
