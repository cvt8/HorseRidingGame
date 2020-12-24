/**
 * 
 */
package cso;

/**
 * @author constantin
 *
 */

class Manege {
	public final int LARGEUR = 3;
	public final int LONGUEUR = 9;
	private ElemManege[][] manege;


	public Manege() {
		manege = new ElemManege[3][9];
	}

	/**
	 * @param elem
	 * @param p
	 * @param abord
	 * Monte un element du manege a l'emplacement i, j sur le tableau.
	 */
	public void monter(ElemManege elem, Point p, Point abord) {
		manege[p.getX()][p.getY()] = elem ;
		elem.setLocalisation(p);
		elem.setOrientation(abord);
	}

	/**
	 * @return the manege
	 */
	public ElemManege[][] getManege() {
		return manege;
	}
	
	public ElemManege getElem(Point p) {
		return manege[p.getX()][p.getY()] ;
	}
}
