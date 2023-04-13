package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	private final String nomPiece = "SalleDeBain";

	public SalleDeBain(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	@Override
	public String getNomPiece() {
		return nomPiece;
	}

}
