package sets;

public class Pays {

	private String nom;
	private long nombreHabitants;
	private double PIBParHabitant;

	public Pays(String nom, long nombreHabitants, double pIBParHabitant) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		PIBParHabitant = pIBParHabitant;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nombreHabitants=" + nombreHabitants + ", PIBParHabitant=" + PIBParHabitant + "]";
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

	public void setNombreHabitants(long nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

	public double getPIBParHabitant() {
		return PIBParHabitant;
	}

	public void setPIBParHabitant(double pIBParHabitant) {
		PIBParHabitant = pIBParHabitant;
	}
}
