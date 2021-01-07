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
	 * @throws PlatException
	 * @throws AbordException
	 * @throws AdjacentException
	 */
	public static void main(String[] args) throws PlatException, AdjacentException, AbordException {
		Parcours parcours = new Parcours();

		Point a1 = new Point(0, 0);
		Point a2 = new Point(0, 1);
		Point a3 = new Point(0, 2);
		Point a4 = new Point(0, 3);
		Point a5 = new Point(0, 4);
		Point a6 = new Point(0, 5);
		Point b1 = new Point(1, 0);
		Point b3 = new Point(1, 2);
		Point b4 = new Point(1, 3);
		Point b5 = new Point(1, 4);
		Point b7 = new Point(1, 6);
		Point c2 = new Point(2, 1);
		Point c3 = new Point(2, 2);
		Point c4 = new Point(2, 3);
		Point c5 = new Point(2, 4);
		Point c6 = new Point(2, 5);
		Point c7 = new Point(2, 6);
		Point c8 = new Point(2, 7);
		/**
		 * Montage du Parcours
		 */

		parcours.ajouterElemem(new Oxer(1.4, 3, 0.4, 1), a5, a4);
		parcours.ajouterElemem(new Oxer(1.6, 2.1, 0.4, 1.3), b5, b4);
		parcours.ajouterElemem(new Vertical(1.1, 3, 3), a2, a1);
		parcours.ajouterElemem(new Vertical(1, 1.3, 2), b3, c3);
		parcours.ajouterElemem(new Vertical(0.8, 0.8, 3), b7, a6);
		Ligne ln1 = new Ligne();
		ln1.addObstacle(new Vertical(1.4, 2.7, 3));
		ln1.addObstacle(new Plat(2));
		ln1.addObstacle(new Oxer(1.4, 2.7, 0.7, 1.6));
		parcours.ajouterElemem(ln1, c5, c6);

		/**
		 * Ajout de l'ordre du parcours
		 */
		parcours.addPoint(a1);
		parcours.addPoint(a2);
		parcours.addPoint(a3);
		parcours.addPoint(a4);
		parcours.addPoint(a5);
		parcours.addPoint(a6);
		parcours.addPoint(b7);
		parcours.addPoint(c8);
		parcours.addPoint(c7);
		parcours.addPoint(c6);
		parcours.addPoint(c5);
		parcours.addPoint(c4);
		parcours.addPoint(c3);
		parcours.addPoint(b3);
		parcours.addPoint(a3);
		parcours.addPoint(a2);
		parcours.addPoint(a1);
		parcours.addPoint(b1);
		parcours.addPoint(c2);
		parcours.addPoint(c3);
		parcours.addPoint(c4);
		parcours.addPoint(b4);
		parcours.addPoint(b5);

		Cavalier cav1 = new Cavalier("Tornado");
		Passage p1 = new Passage(cav1, parcours);
		p1.passage();
	}

}
