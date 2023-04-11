package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 1;
		adr1.libelleRue = "President Wilson";
		adr1.codePostal = 34500;
		adr1.ville = "Beziers";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 2;
		adr2.libelleRue = "President Wilson";
		adr2.codePostal = 34000;
		adr2.ville = "Montpellier";

	}

}
