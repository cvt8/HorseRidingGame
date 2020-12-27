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
		tailleDiff = hauteur + 2 * (hauteur - hauteurAppel);
		vitesseDiff = hauteurAppel + 2 * (hauteur - hauteurAppel) + 1 / Math.pow(largeur, 2) - 2 * profondeur;
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
	public double getLargeurMin() {
		return largeur;
	}

	@Override
	public double getProfondeur() {
		return profondeur;
	}

	/**
	 * Detruit l'obstacle
	 */
	@Override
	public void seDetruire() {
		super.seDetruire();
		hauteurAppel = 0;
	}

	/**
	 * @param p le point where to come from pour arriver droit et au milieu
	 *          L'orientation coorespond a une liste de points par lesquels le
	 *          cavalier peut aborder l'obstacle
	 */
	@Override
	public void setOrientation(Point p) {
		try {
			if (p.equals(localisation))
				throw new MemepointException();
			if (p.sontAdjacents(localisation))
				throw new AdjacentException();
			orientation.clear();
			orientation.add(p);
			for (int i = localisation.getX() - 1; i < localisation.getX() + 2; i++) {
				for (int j = localisation.getY() - 1; j < localisation.getY() + 2; i++) {
					Point test = new Point(i, j);
					if (test.sontAdjacents(p))
						orientation.add(new Point(i, j));
				}
			}

		} catch (MemepointException d) {
			System.out.println(d.getMessage());
		} catch (AdjacentException e) {
			System.out.println(e.getMessage());
			// TODO etre comprehensif
		}
	}

	@Override
	public String toString() {
		return "Auxerre [hauteurAppel=" + hauteurAppel + ", hauteur=" + hauteur + ", id=" + id + ", largeur=" + largeur
				+ ", localisation=" + localisation + ", orientation=" + orientation + ", profondeur=" + profondeur
				+ "]";
	}

}
