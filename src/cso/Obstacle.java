/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public abstract class Obstacle {
	protected double hauteur ;
	protected double largeur ;
	
	public Obstacle(double hauteur, double largeur) {
		super();
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
}
