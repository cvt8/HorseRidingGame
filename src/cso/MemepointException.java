/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
/**
 * @author constantin
 *
 */
public class MemepointException extends AdjacentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -332224306508818587L;

	/**
	 * 
	 */
	public MemepointException(String point) {
		super("Ce sont les memes points ! " + point);
	}

}
