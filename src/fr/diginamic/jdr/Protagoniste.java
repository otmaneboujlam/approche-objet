package fr.diginamic.jdr;

public abstract class Protagoniste {

	private String nom;
	private int force;
	private int pointsVie;

	public Protagoniste(String nom, int force, int pointsVie) {
		super();
		this.nom = nom;
		this.force = force;
		this.pointsVie = pointsVie;
	}

	@Override
	public String toString() {
		return "Protagoniste [nom=" + nom + ", force=" + force + ", pointsVie=" + pointsVie + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointsVie() {
		return pointsVie;
	}

	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}
}
