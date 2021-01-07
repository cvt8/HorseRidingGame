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
		if (ordre.size() != 0) {
			try {
				Point precedent = ordre.get(ordre.size() - 1);
				if (!(precedent.sontAdjacents(p)))
					throw new AdjacentException(p.toString() + precedent.toString());
				if (man.getElem(p) != null && !(man.getElem(p).getOrientation().contains(precedent)))
					throw new AbordException(p.toString() + "Point prec : " + precedent.toString());
				ordre.add(p);
			} catch (AdjacentException e) {
				System.out.println(e.getMessage());
			} catch (AbordException e) {
				System.out.println(e.getMessage());
			}
		} else
			ordre.add(p);
		// System.out.println(Arrays.deepToString(ordre));
	}

	/**
	 * @param i
	 * @return l'obstacle ou la ligne contenant le i+1 ème point traversé
	 */
	public ElemManege getElem(int i) {
		return man.getElem(ordre.get(i));
	}

	/**
	 * @return le nombre de points traverses
	 */
	public int size() {
		return ordre.size();
	}

	public void afficher() {
		man.afficher();
	}

}