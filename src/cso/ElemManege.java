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
	 */
	public void setOrientation(Point p);

	public void setLocalisation(Point p);

	public double getHauteurMax();

	public double getLargeurMin();

	public double getProfondeur();

	public double getTailleDiff();

	public double getVitesseDiff();

	/**
	 * @return
	 */
	public int getId();

	public ArrayList<Point> getOrientation();
}
