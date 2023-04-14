package fr.diginamic.jdr;

public class Creature extends Protagoniste {

	public Creature(String nom, int force, int pointsVie) {
		super(nom, force, pointsVie);
	}

	@Override
	public String toString() {
		return "Creature [toString()=" + super.toString() + "]";
	}

}
