package cso;

/**
 * @author Lucas Zèbre
 *
 */
public class Cavalier {
	private String nom;
	private double tailleCheval;
	private double vitesse;

	public Cavalier(String nom) {
		this.nom = nom;
		this.tailleCheval = 1.48 + Math.random() * (1.8 - 1.48);
		vitesse = 360;
	} // l'IDE signale une erreur ici. Bizarre. Par ailleurs, un cheval reglementaire
		// doit faire plus de 1,48 m.

	/**
	 * @param nom
	 * @param taille
	 * @param vitesse en metres par minutes
	 */
	public Cavalier(String nom, float taille, int score, double vitesse) {
		this.nom = nom;
		this.tailleCheval = taille;
		this.vitesse = vitesse;
	}

	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return la taille du cheval
	 */
	public double getTailleCheval() {
		return tailleCheval;
	}

	/**
	 * @return the vitesse
	 */
	public double getVitesse() {
		return vitesse;
	}

	@Override
	public String toString() {
		return "Cavalier [" + (nom != null ? "nom=" + nom + ", " : "") + ", tailleCheval=" + tailleCheval + ", vitesse="
				+ vitesse + "]";
	}

}