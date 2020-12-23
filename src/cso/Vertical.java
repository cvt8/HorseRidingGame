/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */
public class Vertical extends Obstacle implements ElemManege {

	private int id;
	private int nbBarres;
	private ArrayList<Point> orientation;

	/**
	 * @param hauteur
	 * @param largeur
	 * @param nbBarres
	 */
	public Vertical(double hauteur, double largeur, int nbBarres) {
		super(hauteur, largeur);
		this.nbBarres = nbBarres;
		ElemManege.number++;
		id = number;
		profondeur = 0;
		orientation = new ArrayList<Point>();
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

	public int getNbBarres() {
		return nbBarres;
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

	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(Point p) {
		this.orientation = ;
	}

}
