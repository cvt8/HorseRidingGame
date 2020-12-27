/**
 * 
 */
package cso;

import java.util.ArrayList;

/**
 * @author constantin
 *
 */
public class Parcours {
	private ArrayList<Point> ordre;
	private Manege man;

	/**
	 * 
	 */
	public Parcours() {
		ordre = new ArrayList<Point>();
		man = new Manege();
	}

	/**
	 * @param elem
	 * @param p
	 * @param abord
	 */
	public void ajouterElemem(ElemManege elem, Point p, Point abord) {
		man.monter(elem, p, abord);
	}

	/**
	 * @param p Point a ajouter
	 * @throws AdjacentException
	 * @throws AbordException
	 */
	public void addPoint(Point p) throws AdjacentException, AbordException {
		try {
			Point precedent = ordre.get(ordre.size() - 1);
			if (!(precedent.sontAdjacents(p)))
				throw new AdjacentException();
			if (man.getElem(p) != null && !(man.getElem(p).getOrientation().contains(precedent)))
				throw new AbordException();
			ordre.add(p);
		} catch (AdjacentException e) {
			System.out.println(e.getMessage());
		} catch (AbordException e) {
			System.out.println(e.getMessage());
		}
	}

}
