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

	/**
	 * @param tab
	 */
	public Ligne() {
		super();
		tab = new ArrayList<Obstacle>();
		nbObstacles = 0;
		ElemManege.number++;
		id = number;
	}

// TODO faire une construction de la ligne 
	// en alternant un obstacle et un
	// plat dont les caractéristqiues
	// doivent être choisies par le client

	@Override
	public void seDetruire() {
		for (int i = 0; i < 2 * nbObstacles; i += 2) {
			tab.get(i).seDetruire();
		}

	}

	@Override
	public double getHauteurMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLargeurMin() {
		// TODO Auto-generated method stub
		return 0;
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

}
