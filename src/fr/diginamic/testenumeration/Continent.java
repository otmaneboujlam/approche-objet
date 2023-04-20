package fr.diginamic.testenumeration;

public enum Continent {

	AFRIQUE("Afrique"), AMERIQUE("Amerique"), ASIE("Asie"), EUROPE("Europe"), OCEANIE("Oceanie");

	private String libelle;

	private Continent(String nomContinent) {
		this.libelle = nomContinent;
	}

//	@Override
//	public String toString() {
//		return "Continent [libelle=" + libelle + "]";
//	}

	public String getNomContinent() {
		return libelle;
	}

	public void setNomContinent(String nomContinent) {
		this.libelle = nomContinent;
	}
}
