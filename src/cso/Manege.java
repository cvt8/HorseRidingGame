/**
 * 
 */
package cso;

public class Manege {
	public final int LARGEUR = 3;
	public final int LONGUEUR = 9;
	private ElemManege[][] manege;

	public Manege() {
		manege = new ElemManege[3][9];
	}

	/**
	 * @param elem
	 * @param p
	 * @param abord Monte un element du manege a l'emplacement i, j sur le tableau.
	 */
	void monter(ElemManege elem, Point p, Point abord) {
		manege[p.getX()][p.getY()] = elem;
		elem.setLocalisation(p);
		elem.setOrientation(abord);
	}

	/**
	 * @return the manege
	 */
	public ElemManege[][] getManege() {
		return manege;
	}

	public void Init(String[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			for (int u = 0; u < tab[i].length; u++) {
				switch (i) {
				case 0:
					tab[i][u] = "-";
					break;
				case 3: // obstacle
					if (u == 0 || u == 15) {
						tab[i][u] = "|";
					} else {
						tab[i][u] = "-";
					}
					break;
				case 6: // obstacle
					if (u == 0 || u == 15) {
						tab[i][u] = "|";
					} else {
						tab[i][u] = "-";
					}
					break;
				case 9: // obstacle
					if (u == 0 || u == 15) {
						tab[i][u] = "|";
					} else {
						tab[i][u] = "-";
					}
					break;
				case 12: // obstacle
					if (u == 0 || u == 15) {
						tab[i][u] = "|";
					} else {
						tab[i][u] = "-";
					}
					break;
				case 15: // obstacle
					if (u == 0 || u == 15) {
						tab[i][u] = "|";
					} else {
						tab[i][u] = "-";
					}
					break;

				case 19: // fin
					tab[i][u] = "-";

					break;
				default:
					if (u == 0 || u == 15) {
						tab[i][u] = "|";
					} else {
						tab[i][u] = " ";
					}
				}

			}
		}
	}

	public void afficher(String[][] tab) {
		System.out.println("Depart");
		for (int i = 0; i < tab.length; i++) {
			for (int u = 0; u < tab[i].length; u++) {
				System.out.print(tab[i][u]);
			}
			System.out.println();
		}
		System.out.println("Arrivé");
	}

	public ElemManege getElem(Point p) {
		return manege[p.getX()][p.getY()];
	}

}
