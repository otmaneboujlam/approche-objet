package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {

		Chambre chambre1 = new Chambre(20, 0);
		Chambre chambre2 = new Chambre(18, 0);
		Cuisine cuisine1 = new Cuisine(15, 0);
		Salon salon1 = new Salon(20, 0);
		SalleDeBain salleDeBain1 = new SalleDeBain(7, 0);
		WC wc1 = new WC(3, 0);

		Chambre chambre3 = new Chambre(20, 1);
		Cuisine cuisine2 = new Cuisine(15, 1);
		Salon salon2 = new Salon(20, 1);
		SalleDeBain salleDeBain2 = new SalleDeBain(7, 1);
		WC wc2 = new WC(3, 1);

		Maison maison = new Maison();

		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(cuisine1);
		maison.ajouterPiece(salon1);
		maison.ajouterPiece(salleDeBain1);
		maison.ajouterPiece(wc1);

		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(cuisine2);
		maison.ajouterPiece(salon2);
		maison.ajouterPiece(salleDeBain2);
		maison.ajouterPiece(wc2);

		Chambre chambre4 = new Chambre(-20, 0);
		Chambre chambre5 = new Chambre(20, -2);

		maison.ajouterPiece(null);
		maison.ajouterPiece(chambre4);
		maison.ajouterPiece(chambre5);

		System.out.println(maison.getSuperficieTotale());
		System.out.println(maison.getSuperficieEtage(0));
		System.out.println(maison.getSuperficieEtage(1));

		System.out.println(maison.getSuperficieTotalePiece(chambre1));

		System.out.println(maison.getNbPieces(chambre1));

	}

}
