/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */
public class Parcours {
	private ArrayList<Point> ordre;

	/**
	 * 
	 */
	public Parcours() {
		ordre = new ArrayList<Point>();
	}

	public void addPoint(Point p) {
		ordre.add(p);
	}
// TODO constructeur intelligent pour vérifier que les points soient adjacents.
}
