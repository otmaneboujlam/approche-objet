package fr.diginamic.jdr;

public class Combat {

	private Creature creature;
	private Personnage personnage;
	private boolean isCombatFini;
	private boolean isCreatureDefeated;
	private boolean isPersonnageDefeated;

	public Combat(Personnage personnage, Creature creature) {
		super();
		this.creature = creature;
		this.personnage = personnage;
	}

	public void lancerTour(int numeroTour) {
		Tour tour = new Tour(numeroTour);
		tour.calculerDegatsEtTrouverGagnant(personnage, creature);
		tour.gererPointsVie();
	}

	public void lancerCombat() {
		System.out.println(this);
		int numeroTour = 1;
		do {
			lancerTour(numeroTour);
			numeroTour++;
			if (personnage.getPointsVie() < 0) {
				isPersonnageDefeated = true;
				isCombatFini = true;
			}
			if (creature.getPointsVie() <= 0) {
				isCreatureDefeated = true;
				isCombatFini = true;
			}
		} while (!isCombatFini);
		System.out.println(this);
	}

	public void gererCombat() {
		if (isCombatFini) {
			if (isCreatureDefeated) {
				personnage.setScore(personnage.getScore() + 1);
				System.out.println("Victoire");
				System.out.println(this);
			} else {
				System.out.println("Defaite");
				System.out.println(this);
			}
		}
	}

	@Override
	public String toString() {
		return "Combat [creature=" + creature + ", personnage=" + personnage + ", isCombatFini=" + isCombatFini
				+ ", isCreatureDefeated=" + isCreatureDefeated + ", isPersonnageDefeated=" + isPersonnageDefeated + "]";
	}

}
