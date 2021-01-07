/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class AdjacentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	/**
	 * @param les2pts
	 */
	public AdjacentException(String les2pts) {
		super("Les deux points doivent etre adjacents" + ": " + les2pts);
	}

}
