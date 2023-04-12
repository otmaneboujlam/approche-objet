package fr.diginamic.banque.entites;

public class Compte {
	private long compte;
	private double solde;

	public Compte(long compte, double solde) {
		this.compte = compte;
		this.solde = solde;
	}

	public long getCompte() {
		return compte;
	}

	public void setCompte(long compte) {
		this.compte = compte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
