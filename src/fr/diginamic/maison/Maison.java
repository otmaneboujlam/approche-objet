package fr.diginamic.maison;

import java.util.Objects;

public class Maison {

	private Piece tableauPiece[] = new Piece[0];

	public void ajouterPiece(Piece piece) {
		if (Objects.nonNull(piece) && piece.getNumeroEtage() >= 0 && piece.getSuperficie() > 0) {
			Piece nvTableauPiece[] = new Piece[tableauPiece.length + 1];
			int i = 0;
			for (Piece valeur : tableauPiece) {
				nvTableauPiece[i] = valeur;
				i++;
			}
			nvTableauPiece[tableauPiece.length] = piece;
			tableauPiece = nvTableauPiece;
		}
	}

	public double getSuperficieTotale() {
		double superficieTotale = 0;
		for (Piece valeur : tableauPiece) {
			superficieTotale = superficieTotale + valeur.getSuperficie();
		}
		return superficieTotale;
	}

	public double getSuperficieEtage(int etage) {
		double superficieEtage = 0;
		for (Piece valeur : tableauPiece) {
			if (valeur.getNumeroEtage() == etage) {
				superficieEtage = superficieEtage + valeur.getSuperficie();
			}
		}
		return superficieEtage;
	}

	public double getSuperficieTotalePiece(Piece piece) {
		double superficieTotalePiece = 0;
		for (Piece valeur : tableauPiece) {
			if (valeur.getNomPiece().equals(piece.getNomPiece())) {
				superficieTotalePiece = superficieTotalePiece + valeur.getSuperficie();
			}
		}
		return superficieTotalePiece;
	}

	public int getNbPieces(Piece piece) {
		int nombrePieces = 0;
		for (Piece valeur : tableauPiece) {
			if (valeur.getNomPiece().equals(piece.getNomPiece())) {
				nombrePieces++;
			}
		}
		return nombrePieces;
	}

}
