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
public class Manege {
	public final int LARGEUR = 3;
	public final int LONGUEUR = 9;
	private ElemManege[][] manege;

	public Manege() {
		manege = new ElemManege[9][3];
	}

	/**
	 * Monte un élement du manège à l'emplacement i, j sur le tableau.
	 */
	public void monter(ElemManege e, int i, int j) {
		manege[i][j] = e ;
		\\TODO mettre de la gestion d erreur dans ce programme en cas de dépassemnt pour i et j
	}
}
