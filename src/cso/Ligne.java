/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author Constantin
 *
 */
public class Ligne implements ElemManege {

	private static int number = 1000;

	/**
	 * @return the number
	 */
	public static int getNumber() {
		return number;
	}

	private int id;
	private Point localisation;
	private int nbObstacles;
	private boolean needPlat;
	private ArrayList<Point> orientation;
	private ArrayList<Obstacle> tab;
	private double tailleDiff;
	private double vitesseDiff;

	/**
	 * 
	 */
	public Ligne() {
		super();
		tab = new ArrayList<Obstacle>();
		nbObstacles = 0;
		number++;
		id = number;
		orientation = new ArrayList<Point>();
		localisation = new Point(-1, -1);
		needPlat = false;
		tailleDiff = 0;
		vitesseDiff = 0;
	}

	/**
	 * @param o : l'obstacle a ajouter
	 * @throws PlatException Cette fonction ajoute un obstacle
	 */
	public void addObstacle(Obstacle o) throws PlatException {
		try {
			if (!(o instanceof Plat)) {
				if (needPlat)
					throw new PlatException(o.toString());
				needPlat = true;
				nbObstacles++;
				tailleDiff += o.tailleDiff;
				tailleDiff = Math.sqrt(tailleDiff);
				vitesseDiff += o.vitesseDiff;
				vitesseDiff = Math.sqrt(vitesseDiff);
			} else {
				needPlat = false;
				vitesseDiff += o.vitesseDiff;
			}
			tab.add(o);
		} catch (PlatException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 *
	 */
	@Override
	public double getHauteurMax() {
		double res = 0;
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).hauteur > res)
				res = tab.get(i).hauteur;
		}
		return res;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public double getLargeurMin() {
		double res = 60;
		for (Obstacle o : tab) {
			if (o.getHauteur() != 0 && o.hauteur < res)
				res = o.hauteur;
		}
		return res;
	}

	/**
	 * @return the localisation
	 */
	public Point getLocalisation() {
		return localisation;
	}

	/**
	 * @return the nbObstacles
	 */
	public int getNbObstacles() {
		return nbObstacles;
	}

	@Override
	public ArrayList<Point> getOrientation() {
		return orientation;
	}

	@Override
	public double getProfondeur() {
		double res = 0;
		for (Obstacle o : tab) {
			res += o.profondeur;
		}
		return res;
	}

	/**
	 * @return the tab
	 */
	public ArrayList<Obstacle> getTab() {
		return tab;
	}

	@Override
	public double getTailleDiff() {
		return tailleDiff;
	}

	@Override
	public double getVitesseDiff() {
		return vitesseDiff;
	}

	@Override
	public void seDetruire() {
		for (Obstacle o : tab) {
			o.seDetruire();
		}
	}

	@Override
	public void setLocalisation(Point p) {
		localisation = p;
		for (Obstacle o : tab) {
			o.setLocalisation(p);
		}
	}

	/**
	 * @param p Point pour entrer droit et au milieu
	 */
	@Override
	public void setOrientation(Point p) {
		for (Obstacle o : tab) {
			if (!(o instanceof Plat))
				o.setOrientation(p);
		}
		Obstacle premier = tab.get(0);
		for (Point pos : premier.getOrientation()) {
			boolean abscence = false;
			for (Obstacle o : tab) {
				if (!(o instanceof Plat)) {
					if (!(o.orientation.contains(pos))) {
						abscence = true;
						break;
					}
				}
			}
			if (abscence)
				continue;
			orientation.add(pos);
		}
	}

	@Override
	public String toString() {
		return "Ligne [id=" + id + ", " + (localisation != null ? "localisation=" + localisation + ", " : "")
				+ "nbObstacles=" + nbObstacles + ", " + (orientation != null ? "orientation=" + orientation + ", " : "")
				+ (tab != null ? "tab=" + tab + ", " : "") + "tailleDiff=" + tailleDiff + ", vitesseDiff=" + vitesseDiff
				+ "]";
	}

}
