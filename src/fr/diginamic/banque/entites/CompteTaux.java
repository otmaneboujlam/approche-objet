package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private float tauxRemuniration;

	public CompteTaux(String numeroCompte, double solde, float taux) {

		super(numeroCompte, solde);
		tauxRemuniration = taux;
	}

	public String toString() {
		return super.toString() + " " + tauxRemuniration + "%";
	}

	public float getTauxRemuniration() {
		return tauxRemuniration;
	}

	public void setTauxRemuniration(float tauxRemuniration) {
		this.tauxRemuniration = tauxRemuniration;
	}
}
