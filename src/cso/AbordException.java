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
	/**
	 * @param point
	 */
	public AbordException(String point) {
		super("Cette case contient un obstacle situé en " + point
				+ " qui n'est pas abordable depuis la position precedente");
	}

}
