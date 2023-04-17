package tri;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nombreHabitants;

	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

//	@Override
//	public int compareTo(Ville autre) {
//		return this.nom.compareTo(autre.getNom());
//	}

	@Override
	public int compareTo(Ville autre) {
		if (this.nombreHabitants > autre.getNombreHabitants()) {
			return 1;
		} else if (this.nombreHabitants < autre.getNombreHabitants()) {
			return -1;
		} else
			return 0;
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
