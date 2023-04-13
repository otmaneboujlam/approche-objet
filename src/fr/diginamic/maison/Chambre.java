package fr.diginamic.maison;

public class Chambre extends Piece {

	private final String nomPiece = "Chambre";

	public Chambre(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	@Override
	public String getNomPiece() {
		return nomPiece;
	}

}
