package fr.diginamic.automates;

public class GererSurvieEtMort {

	public void traiterSurvieEtMort(CellulesFactory cellules) {
		for (Cellule cellule : cellules.getCellules()) {
			if (cellule.isVisible()) {
				if (cellules.getPositionList().contains((cellule.getPositionX() + 1) + "-" + cellule.getPositionY())) {
					cellule.setHasRight(true);
					cellule.setNombreCelluleAdj(cellule.getNombreCelluleAdj() + 1);
				}
				if (cellules.getPositionList().contains((cellule.getPositionX() - 1) + "-" + cellule.getPositionY())) {
					cellule.setHasLeft(true);
					cellule.setNombreCelluleAdj(cellule.getNombreCelluleAdj() + 1);
				}
				if (cellules.getPositionList().contains(cellule.getPositionX() + "-" + (cellule.getPositionY() + 1))) {
					cellule.setHasTop(true);
					cellule.setNombreCelluleAdj(cellule.getNombreCelluleAdj() + 1);
				}
				if (cellules.getPositionList().contains(cellule.getPositionX() + "-" + (cellule.getPositionY() - 1))) {
					cellule.setHasBottom(true);
					cellule.setNombreCelluleAdj(cellule.getNombreCelluleAdj() + 1);
				}
			}
		}
		for (Cellule cellule : cellules.getCellules()) {
			if (cellule.isVisible()) {
				if (cellule.getNombreCelluleAdj() < 4 && cellule.getNombreCelluleAdj() > 1) {
					cellule.setWillSurvive(true);
				} else {
					cellule.setWillSurvive(false);
				}
			}
		}
	}
}
