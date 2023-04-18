package fr.diginamic.recensement;

public class Departement implements Comparable<Departement> {

	private int codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private int populationDepartementTotale;

	public Departement(int codeRegion, String nomRegion, String codeDepartement, int populationDepartementTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.populationDepartementTotale = populationDepartementTotale;
	}

	@Override
	public int compareTo(Departement autre) {
		return autre.getPopulationDepartementTotale() - this.populationDepartementTotale;
	}

	@Override
	public String toString() {
		return "Departement [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement="
				+ codeDepartement + ", populationDepartementTotale=" + populationDepartementTotale + "]";
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulationDepartementTotale() {
		return populationDepartementTotale;
	}

	public void setPopulationDepartementTotale(int populationDepartementTotale) {
		this.populationDepartementTotale = populationDepartementTotale;
	}

}
