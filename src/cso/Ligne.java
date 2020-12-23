/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */
public class Ligne implements ElemManege {

	private int nbObstacles;
	private ArrayList<Obstacle> tab;
	private int id;
	private ArrayList<Point> orientation;

	/**
	 * 
	 */
	public Ligne() {
		super();
		tab = new ArrayList<Obstacle>();
		nbObstacles = 0;
		ElemManege.number++;
		id = number;
		orientation = new ArrayList<Point>();
	}

// TODO faire une construction de la ligne 
	// en alternant un obstacle et un
	// plat dont les caractéristqiues
	// doivent être choisies par le client

	@Override
	public void seDetruire() {
		for (int i = 0; i < tab.size(); i += 2) {
			tab.get(i).seDetruire();
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
	public double getLargeurMin() {
		double res = 60;
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i) != 0 && tab.get(i).hauteur < res)
				res = tab.get(i).hauteur;
		}
		return res;
	}

	@Override
	public double getProfondeur() {
		double res = 0;
		for (int i = 0; i < 2 * nbObstacles; i++) {
			res += tab.get(i).profondeur;
		}
		return res;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public ArrayList<Point> getOrientation() {
		return orientation;
	}

	/**
	 * @return the nbObstacles
	 */
	public int getNbObstacles() {
		return nbObstacles;
	}

	/**
	 * @return the tab
	 */
	public ArrayList<Obstacle> getTab() {
		return tab;
	}

	/**
	 * @param orientation the orientation to set
	 */
	@Override
	public void setOrientation(ArrayList<Point> orientation) {
		this.orientation = orientation;
	}

}
