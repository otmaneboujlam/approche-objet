package fr.diginamic.recensement;

import java.util.ArrayList;

public class Recensement {

	private ArrayList<Ville> villes = new ArrayList<>();

	public Recensement(ArrayList<Ville> villes) {
		super();
		this.villes = villes;
	}

	@Override
	public String toString() {
		return "Recensement [villes=" + villes + "]";
	}

	public ArrayList<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}

}
