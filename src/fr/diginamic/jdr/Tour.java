package fr.diginamic.jdr;

import java.util.Random;

public class Tour {

	private int numeroTour;
	private Protagoniste gagnant;
	private Protagoniste perdant;
	private int degats;

	public Tour(int numeroTour) {
		super();
		this.numeroTour = numeroTour;
	}

	@Override
	public String toString() {
		return "Tour [numeroTour=" + numeroTour + ", gagnant=" + gagnant + ", perdant=" + perdant + ", degats=" + degats
				+ "]";
	}

	public void calculerDegatsEtTrouverGagnant(Personnage p, Creature c) {
		Random rand = new Random();
		degats = (p.getForce() + rand.nextInt(10) + 1) - (c.getForce() + rand.nextInt(10) + 1);
		if (degats > 0) {
			gagnant = p;
			perdant = c;
		} else {
			degats = -degats;
			gagnant = c;
			perdant = p;
		}
		System.out.println(this);
	}

	public void gererPointsVie() {
		perdant.setPointsVie(perdant.getPointsVie() - degats);
	}
}
