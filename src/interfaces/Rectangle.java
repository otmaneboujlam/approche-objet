package interfaces;

/**
 * Class Rectangle
 * 
 * @author Otmane
 *
 */
public class Rectangle implements ObjetGeometrique {

	/**
	 * Attribut longueur
	 * 
	 */
	private double longueur;

	/**
	 * Attribut largeur
	 * 
	 */
	private double largeur;

	/**
	 * Constructeur
	 * 
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return (longueur + largeur) * 2;
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	/**
	 * Getter
	 * 
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * Setter
	 * 
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * Getter
	 * 
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * Setter
	 * 
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
