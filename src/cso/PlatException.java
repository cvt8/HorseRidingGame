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
	 * 
	 */
	public PlatException(String message) {
		super("Il aurait fallut ajouter un plat alors que " + message + " a ete mis.") ;
	}

}
