package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capaciteMax;
	private int clientsInscrits;
	private double recetteTotale;

	public Theatre(String nom, int capaciteMax) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.clientsInscrits = 0;
		this.recetteTotale = 0;
	}

	public void inscrire(int nbClients, double prixPlace) {
		if (clientsInscrits + nbClients < capaciteMax) {
			clientsInscrits = clientsInscrits + nbClients;
			recetteTotale = recetteTotale + nbClients * prixPlace;
		} else {
			System.out.println("Erreur : La capacité max est atteinte");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getClientsInscrits() {
		return clientsInscrits;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

}
