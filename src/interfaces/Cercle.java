package interfaces;

/**
 * Class Cercle
 * 
 * @author Otmane
 *
 */
public class Cercle implements ObjetGeometrique {

	/**
	 * Attribut rayon
	 * 
	 */
	private double rayon;

	/**
	 * Constructeur
	 * 
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * this.rayon;
	}

	@Override
	public double surface() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

	/**
	 * Getter
	 * 
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * Setter
	 * 
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
