/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */
public class Auxerre extends Obstacle implements ElemManege {

	private double hauteurAppel;
	private ArrayList<Point> orientation;

	/**
	 * @param hauteur
	 * @param largeur
	 * @param profondeur
	 * @param hauteurAppel
	 */
	public Auxerre(double hauteur, double largeur, double profondeur, double hauteurAppel) {
		super(hauteur, largeur);
		this.profondeur = profondeur;
		this.hauteurAppel = hauteurAppel;
		ElemManege.number++;
		id = number;
		orientation = new ArrayList<Point>();
	}

	/**
	 * @return the hauteurAppel
	 */
	public double getHauteurAppel() {
		return hauteurAppel;
	}

	@Override
	public double getHauteurMax() {
		return hauteur;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public double getLargeurMin() {
		return largeur;
	}

	/**
	 * @return the orientation
	 */
	@Override
	public ArrayList<Point> getOrientation() {
		return orientation;
	}

	@Override
	public double getProfondeur() {
		return profondeur;
	}

	@Override
	public void seDetruire() {
		super.seDetruire();
		hauteurAppel = 0;
	}

	/**
	 * @param p le point d'où venir pour arriver droit et au milieu
	 */
	public void setOrientation(Point p) {
		this.orientation = ;
	}

}
