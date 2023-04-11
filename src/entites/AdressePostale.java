package entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	public AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille) {
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelleRue;
		codePostal = nvCodePostal;
		ville = nvVille;
	}

}
