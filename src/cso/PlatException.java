/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class PlatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8019834125078965934L;

	/**
	 * @param mauvaisObstacle
	 */
	public PlatException(String mauvaisObstacle) {
		super("Il aurait fallut ajouter un plat alors que " + mauvaisObstacle + " a ete mis.");
	}

}
