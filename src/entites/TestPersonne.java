package entites;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne("BOUJLAM", "Otmane");
		AdressePostale adr1 = new AdressePostale(1, "avenue du President Wilson", 34500, "Beziers");
		p1.setAdresse(adr1);
	}

}
