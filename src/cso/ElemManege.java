/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */

public interface ElemManege {

	public void seDetruire();

	/**
	 * Définit les points par lesquels un cavalier peut aborder l'obstacle
	 * 
	 * @param p le point pour arriver droit et au milieu
	 */
	public void setOrientation(Point p);

	/**
	 * @param p le lieu de l'élement
	 */
	public void setLocalisation(Point p);

	/**
	 * @return
	 */
	public double getHauteurMax();

	/**
	 * @return
	 */
	public double getLargeurMin();

	/**
	 * @return la profondeur de l'element
	 */
	public double getProfondeur();

	/**
	 * @return le score de diff pour la taille du cheval
	 */
	public double getTailleDiff();

	/**
	 * @return le score de diff pour la vitesse
	 */
	public double getVitesseDiff();

	/**
	 * @return l'Id
	 */
	public int getId();

	/**
	 * @return la liste des points par où l'obstacle peut être aborde
	 */
	public ArrayList<Point> getOrientation();
}
