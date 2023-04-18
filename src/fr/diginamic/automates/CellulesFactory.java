package fr.diginamic.automates;

import java.util.ArrayList;

public class CellulesFactory {

	private ArrayList<Cellule> cellules = new ArrayList<>();
	private ArrayList<String> positionList = new ArrayList<>();

	public CellulesFactory(ArrayList<Cellule> cellules, ArrayList<String> positionList) {
		super();
		this.cellules = cellules;
		this.positionList = positionList;
	}

	@Override
	public String toString() {
		return "CellulesFactory [Cellules=" + cellules + ", positionList=" + positionList + "]";
	}

	public ArrayList<Cellule> getCellules() {
		return cellules;
	}

	public void setCellules(ArrayList<Cellule> cellules) {
		this.cellules = cellules;
	}

	public ArrayList<String> getPositionList() {
		return positionList;
	}

	public void setPositionList(ArrayList<String> positionList) {
		this.positionList = positionList;
	}
}
