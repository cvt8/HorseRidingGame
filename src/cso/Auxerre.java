/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class Auxerre extends Obstacle implements ElemManege {

	private double hauteurAppel;

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
	}

	@Override
	public void seDetruire() {
		super.seDetruire();
		hauteurAppel = 0;

	}

	@Override
	public double getHauteurMax() {
		return hauteur;
	}

	@Override
	public double getLargeurMin() {
		return largeur;
	}

	@Override
	public double getProfondeur() {
		return profondeur;
	}

	@Override
	public int getId() {
		return id;
	}

	/**
	 * @return the hauteurAppel
	 */
	public double getHauteurAppel() {
		return hauteurAppel;
	}

}
