package fr.diginamic.automates;

public class GererPassageNextGeneration {

	public void traiterPassageNextGeneration(CellulesFactory cellules) {
		for (Cellule cellule : cellules.getCellules()) {
			cellule.setHasBottom(false);
			cellule.setHasTop(false);
			cellule.setHasLeft(false);
			cellule.setHasRight(false);
			cellule.setHasLeftBottom(false);
			cellule.setHasLeftTop(false);
			cellule.setHasRightTop(false);
			cellule.setHasRightBottom(false);
			cellule.setNombreCelluleAdj(0);
			if (cellule.isVisible() && !cellule.isWillSurvive()) {
				cellule.setVisible(false);
				cellule.setWillSurvive(false);
			}
			if (cellule.isVisible() && cellule.isWillSurvive()) {
				cellule.setVisible(true);
				cellule.setWillSurvive(false);
			}
			if (!cellule.isVisible() && cellule.isWillGiveBirth()) {
				cellule.setVisible(true);
				cellule.setWillGiveBirth(false);
			}
			if (!cellule.isVisible() && !cellule.isWillGiveBirth()) {
				cellule.setVisible(false);
				cellule.setWillGiveBirth(false);
			}
		}
	}
}
