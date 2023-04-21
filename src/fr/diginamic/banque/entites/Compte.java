package fr.diginamic.banque.entites;

/**
 * Class
 * 
 * @author Otmane
 *
 */
public class Compte {

	/**
	 * Attribut numeroCompte
	 * 
	 */
	private String numeroCompte;
	private double solde;

	public Compte(String compte, double solde) {
		this.numeroCompte = compte;
		this.solde = solde;
	}

	public String toString() {
		return numeroCompte + " " + solde;
	}

	/**
	 * Getter
	 * 
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * Setter
	 * 
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * Getter
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
