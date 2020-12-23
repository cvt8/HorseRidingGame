/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public abstract class Obstacle {

	protected double hauteur;
	protected int id;

	protected double largeur;

	protected double profondeur;

	public Obstacle() {
	}

	public Obstacle(double hauteur, double largeur) {
		super();
		this.hauteur = hauteur;
		this.largeur = largeur;
	}

	/**
	 * @return the hauteur
	 */
	public double getHauteur() {
		return hauteur;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @return the profondeur
	 */
	public double getProfondeur() {
		return profondeur;
	}

	public void seDetruire() {
		hauteur = 0;
		largeur = 0;
		profondeur = 0;
	}
}
