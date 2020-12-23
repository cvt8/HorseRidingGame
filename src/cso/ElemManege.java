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
	public static int number = 0;

	public void seDetruire();

	/**
	 * 
	 */
	public void setOrientation(ArrayList<Point> orientation);

	public double getHauteurMax();

	public double getLargeurMin();

	public double getProfondeur();

	/**
	 * @return
	 */
	public int getId();

	public ArrayList<Point> getOrientation();
}
