package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compteOtmane = new Compte(1L, 15.223d);
		System.out.println(compteOtmane.getCompte() + " " + compteOtmane.getSolde());
	}

}
