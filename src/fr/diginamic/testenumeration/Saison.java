package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int numeroOrdre;

	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}

	public static Saison trouverInstance(String nom) {
		if (nom == null) {
			return null;
		}
		for (int i = 0; i < Saison.values().length; i++) {
			if (nom.equals(Saison.values()[i].getLibelle())) {
				return Saison.values()[i];
			}
		}
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}

	@Override
	public String toString() {
		return "Saison [libelle=" + libelle + ", numeroOrdre=" + numeroOrdre + "]";
	}

}
