/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */
public abstract class Obstacle {

	protected static int cpt = 0;
	protected double hauteur;
	protected int id;
	protected double largeur;
	protected double vitesseDiff;
	protected double tailleDiff;
	protected Point localisation;
	protected ArrayList<Point> orientation;

	protected double profondeur;

	public Obstacle() {
		cpt++;
		id = cpt;
		largeur = 0;
		hauteur = 0;
		profondeur = 0;
		vitesseDiff = 0;
		tailleDiff = 0;
		localisation = new Point(-1, -1);
		orientation = new ArrayList<Point>();
	}

	public Obstacle(double hauteur, double largeur) {
		super();
		this.hauteur = hauteur;
		this.largeur = largeur;
		cpt++;
		id = cpt;
		profondeur = 0;
		vitesseDiff = 0;
		tailleDiff = 0;
		localisation = new Point(-1, -1);
		orientation = new ArrayList<Point>();
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
	 * @return the localisation
	 */
	public Point getLocalisation() {
		return localisation;
	}

	/**
	 * @return the vitesseDiff
	 */
	public double getVitesseDiff() {
		return vitesseDiff;
	}

	/**
	 * @return the tailleDiff
	 */
	public double getTailleDiff() {
		return tailleDiff;
	}

	/**
	 * @return the orientation
	 */
	public ArrayList<Point> getOrientation() {
		return orientation;
	}

	/**
	 * @return the profondeur
	 */
	public double getProfondeur() {
		return profondeur;
	}

	/**
	 * Detruit l'obstacle
	 */
	public void seDetruire() {
		hauteur = 0;
		largeur = 0;
		profondeur = 0;
	}

	/**
	 * @param localisation the localisation to set
	 */
	public void setLocalisation(Point localisation) {
		this.localisation = localisation;
	}

	@Override
	public String toString() {
		return "Obstacle [hauteur=" + hauteur + ", id=" + id + ", largeur=" + largeur + ", localisation=" + localisation
				+ ", orientation=" + orientation + ", profondeur=" + profondeur + "]";
	}

}
