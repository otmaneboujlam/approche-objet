package fr.diginamic.jdr;

public class Personnage extends Protagoniste {

	private int score;

	public Personnage(String nom, int force, int pointsVie, int score) {
		super(nom, force, pointsVie);
		this.score = score;
	}

	@Override
	public String toString() {
		return "Personnage [score=" + score + ", toString()=" + super.toString() + "]";
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
