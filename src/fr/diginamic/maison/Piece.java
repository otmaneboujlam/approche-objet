package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int numeroEtage;

	public Piece(double superficie, int numeroEtage) {
		super();
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}

	public abstract String getNomPiece();

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", numeroEtage=" + numeroEtage + ", getNomPiece()=" + getNomPiece()
				+ "]";
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumeroEtage() {
		return numeroEtage;
	}

	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
}
