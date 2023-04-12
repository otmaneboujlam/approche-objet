package fr.diginamic.banque.entites;

public class Compte {

	private String numeroCompte;
	private double solde;

	public Compte(String compte, double solde) {
		this.numeroCompte = compte;
		this.solde = solde;
	}

	public String toString() {
		return numeroCompte + " " + solde;
	}

	public String getCompte() {
		return numeroCompte;
	}

	public void setCompte(String compte) {
		this.numeroCompte = compte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
