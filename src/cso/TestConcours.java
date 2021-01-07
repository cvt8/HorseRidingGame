/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */
public class TestConcours {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcours parcours = new Parcours();

		/**
		 * Montage du Parcours
		 */

		Cavalier cav1 = new Cavalier("Tornado");
		Passage p1 = new Passage(cav1, parcours);
		p1.passage();
	}

}
