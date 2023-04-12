package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	float tauxRemuniration;

	public CompteTaux(String numeroCompte, double solde, float taux) {

		super(numeroCompte, solde);
		tauxRemuniration = taux;
	}

	public String toString() {
		return super.toString() + " " + tauxRemuniration + "%";
	}
}
