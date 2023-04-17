package fr.diginamic.recensement;

public class Region implements Comparable<Region> {

	private int codeRegion;
	private String nomRegion;
	private int populationRegionTotale;

	public Region(int codeRegion, String nomRegion, int populationRegionTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationRegionTotale = populationRegionTotale;
	}

	@Override
	public int compareTo(Region autre) {
		return autre.getPopulationRegionTotale() - this.populationRegionTotale;
	}

	@Override
	public String toString() {
		return "Region [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", populationRegionTotale="
				+ populationRegionTotale + "]";
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

	public int getPopulationRegionTotale() {
		return populationRegionTotale;
	}

	public void setPopulationRegionTotale(int populationRegionTotale) {
		this.populationRegionTotale = populationRegionTotale;
	}

}
