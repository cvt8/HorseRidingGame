/**
 * 
 */
package cso;

// Termine
/**
 * @author constantin
 *
 */
public class Plat extends Obstacle {

	/**
	 * 
	 */
	public Plat(double profondeur) {
		super();
		this.profondeur = profondeur;
		vitesseDiff = 1 / Math.pow(profondeur, 2);
	}

	@Override
	protected void setOrientation(Point p) {
		// TODO automated, add all points
	}

}
