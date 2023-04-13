package fr.diginamic.maison;

public class Cuisine extends Piece {

	private final String nomPiece = "Cuisine";

	public Cuisine(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	@Override
	public String getNomPiece() {
		return nomPiece;
	}

}
