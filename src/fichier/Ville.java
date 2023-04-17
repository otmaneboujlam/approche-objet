package fichier;

public class Ville {

	private String nom;
	private int codeDepartement;
	private String nomRegion;
	private int populationTotale;

	public Ville(String nom, int codeDepartement, String nomRegion, int populationTotale) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codeDepartement=" + codeDepartement + ", nomRegion=" + nomRegion
				+ ", populationTotale=" + populationTotale + "]";
	}

	public String getNom() {
		return nom;
	}

	public int getCodeDepartement() {
		return codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

}
