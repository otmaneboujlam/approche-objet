package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		p1.nom = "BOUJLAM";
		p1.prenom = "Otmane";
		p1.adresse.numeroRue = 1;
		p1.adresse.libelleRue = "President Wilson";
		p1.adresse.codePostal = 34500;
		p1.adresse.ville = "Beziers"; 
		
		Personne p2 = new Personne();
		p2.nom = "COUSCOUS";
		p2.prenom = "Boulette";
		p2.adresse.numeroRue = 2;
		p2.adresse.libelleRue = "President Wilson";
		p2.adresse.codePostal = 34000;
		p2.adresse.ville = "Montpellier"; 

	}

}
