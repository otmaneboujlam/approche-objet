package fr.diginamic.testenumeration;

public class Ville {

	private String nom;
	private long nombreHabitants;
	private Continent continent;

	public Ville(String nom, int nombreHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		this.setContinent(continent);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}

		Ville autre = (Ville) obj;
		return this.nom.equals(autre.getNom()) && this.nombreHabitants == autre.getNombreHabitants();
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nombreHabitants=" + nombreHabitants + ", continent=" + continent + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
}
