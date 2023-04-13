package fr.diginamic.maison;

public class Salon extends Piece {

	private final String nomPiece = "Salon";

	public Salon(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	@Override
	public String getNomPiece() {
		return nomPiece;
	}

}
