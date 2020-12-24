/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class AbordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3019288873065626649L;

	/**
	 * 
	 */
	public AbordException() {
		super("Cette case contient un obstacle qui n'est pas abordable depuis la position precedente") ;
	}

}
