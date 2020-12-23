/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class Vertical extends Obstacle implements ElemManege {

	private int id;
	/**
	 * 
	 */
	private int nbBarres;

	/**
	 * @param hauteur : la heuteur de l'obstacle
	 * @param largeur : la largeur de l'obstacle
	 */
	public Vertical(double hauteur, double largeur, int nbBarres) {
		super(hauteur, largeur);
		this.nbBarres = nbBarres;
		ElemManege.number++;
		id = number;
		profondeur = 0;
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

}
