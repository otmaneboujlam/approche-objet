package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compteOtmane = new Compte("A001", 15.223d);
		System.out.println(compteOtmane);
	}

}
