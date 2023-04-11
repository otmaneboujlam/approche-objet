package entites;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(1, "avenue du President Wilson", 34500, "Beziers");
		Personne p1 = new Personne("BOUJLAM", "Otmane", adr1);
		
		
		Personne p2 = new Personne("COUSCOUS", "Boulette");
	}

}
