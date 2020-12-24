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
	 * 
	 */
	public void setOrientation(Point p);
	
	public void setLocalisation(Point p) ;

	public double getHauteurMax();

	public double getLargeurMin();

	public double getProfondeur();

	/**
	 * @return
	 */
	public int getId();

	public ArrayList<Point> getOrientation();
}
