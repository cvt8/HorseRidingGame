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
	public AdjacentException() {
		super("Les deux points doivent etre adjacents");
	}
	
	public AdjacentException(String message) {
		super("Les deux points doivent etre adjacents" + ": " + message);
	}

}
