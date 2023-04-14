package fr.diginamic.jdr;

public class TestCombat {

	public static void main(String[] args) {

		Personnage personnage = new Personnage("Otmane", 15, 45, 0);
		// Debut partie
		Creature creature = new Creature("Loup", 7, 9);
		Combat combat = new Combat(personnage, creature);
		combat.lancerCombat();
		combat.gererCombat();
		// Fin partie
	}

}
