package fr.diginamic.maison;

public class WC extends Piece {

	private final String nomPiece = "WC";

	public WC(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	@Override
	public String getNomPiece() {
		return nomPiece;
	}

}
