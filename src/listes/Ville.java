package listes;

public class Ville {

	private String nom;
	private int nombreHabitants;

	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
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
		return "Ville [nom=" + nom + ", nombreHabitants=" + nombreHabitants + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}
}
