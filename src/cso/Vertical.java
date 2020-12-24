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

	private int nbBarres;

	/**
	 * @param hauteur
	 * @param largeur
	 * @param nbBarres
	 */
	public Vertical(double hauteur, double largeur, int nbBarres) {
		super(hauteur, largeur);
		this.nbBarres = nbBarres;
	}

	@Override
	public double getHauteurMax() {
		return hauteur;
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

	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(Point p) {
		try {
			if (p.equals(localisation))
				throw new MemepointException() ;
			if (p.sontAdjacents(localisation))
				throw new AdjacentException() ;
			orientation.clear();
			orientation.add(p) ;
			for (int i = localisation.getX() -1 ; i < localisation.getX() +2 ; i++) {
				for (int j = localisation.getY() -1 ; j < localisation.getY() +2 ; i++) {
					Point essai = new Point(i,j) ;
					if(essai.sontAdjacents(p)) {
						orientation.add(new Point(i,j)) ;
						orientation.add(new Point(essai.getSymetrique(localisation))) ;
					}
				}
			}
		}catch(MemepointException d) {
			System.out.println(d.getMessage()) ;
		}
		catch(AdjacentException e) {
			System.out.println(e.getMessage()) ;
			// TODO etre comprehensif
		}
	}

	@Override
	public String toString() {
		return "Vertical [nbBarres=" + nbBarres + ", hauteur=" + hauteur + ", id=" + id + ", largeur=" + largeur
				+ ", localisation=" + localisation + ", orientation=" + orientation + ", profondeur=" + profondeur
				+ "]";
	}
	
	
}