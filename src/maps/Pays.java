package maps;

public class Pays {

	private String nom;
	private double nombreHabitants;
	private String continent;

	public Pays(String nom, int nombreHabitants, String continent) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nombreHabitants=" + nombreHabitants + ", continent=" + continent + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(double nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
}
