package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nbJours;
	private double salaireJournalier;
	private final String statut = "Pigiste";

	public Pigiste(String nom, String prenom, int nbJours, double salaireJournalier) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public double getSalaire() {
		return nbJours * salaireJournalier;
	}

	@Override
	public String getStatut() {
		return statut;
	}

	@Override
	public String toString() {
		return "Pigiste [nbJours=" + nbJours + ", salaireJournalier=" + salaireJournalier + ", toString()="
				+ super.toString() + "]";
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public double getSalaireJournalier() {
		return salaireJournalier;
	}

	public void setSalaireJournalier(double salaireJournalier) {
		this.salaireJournalier = salaireJournalier;
	}
}
