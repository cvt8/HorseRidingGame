/**
 * 
 */
package cso;

/**
 * @author Lucas Zebre et Constantin Tenzer
 *
 */
public class Passage {
	private Cavalier cav;
	private Parcours par;
	private boolean abandon;
	private boolean started;
	private boolean finished;
	private int points;
	private double time;
	private double score;
	private static int cpt = 0;
	private int id;

	/**
	 * @param cav
	 * @param par
	 */
	public Passage(Cavalier cav, Parcours par) {
		super();
		this.cav = cav;
		this.par = par;
		abandon = false;
		started = false;
		finished = false;
		points = 0;
		time = 0;
		score = 0;
		cpt++;
		id = cpt;
	}

	/**
	 * @param random l'obstacle sauté
	 * @param tou    le cheval qui saute
	 */
	public void saut(ElemManege random, Cavalier tou) {
		// taille minimun de cheval de 1.48
		switch (random.getId()) {
		case 1: // Le plus petit si on le passe pas eliminatoire
			if (tou.getTailleCheval() == 1.48) {

				if ((Math.random() * 100) > 30) // 70 pourcent de chance de sauter
				{
					score--;
				} else {
					score -= 2;

				}
			} else if (tou.getTailleCheval() == 1.65) {
				if ((Math.random() * 100) > 25) // 75 pourcent de chance de sauter
				{
					score--;
				} else {
					score -= 3;
				}
			} else {
				if ((Math.random() * 100) > 20) {
					score--;
				} else {
					score -= 4;
				}
			}
			break;
		case 2: // Milieux de gammes
			if (tou.getTailleCheval() == 1.60) {

				if ((Math.random() * 100) > 30) // 70 pourcent de chance de sauter
				{
					score--;
				} else {
					score -= 2;

				}
			} else if (tou.getTailleCheval() == 1.65) {
				if ((Math.random() * 100) > 25) // 75 pourcent de chance de sauter
				{
					score--;
				} else {
					score -= 3;
				}
			} else {
				if ((Math.random() * 100) > 20) {
					score--;
				} else {
					score -= 6;
				}
			}
			break;
		default:// 3eme type obstacle les plus haut

			if (tou.getTailleCheval() == 1.60) {

				if ((Math.random() * 100) > 30) // 60 pourcent de chance de sauter
				{
					score--;
				} else {
					score -= 5;

				}
			} else if (tou.getTailleCheval() == 1.65) {
				if ((Math.random() * 100) > 25) // 75 pourcent de chance de sauter
				{
					score--;
				} else {
					score -= 10;
					;
				}
			} else {
				if ((Math.random() * 100) > 20) {
					score--;
				} else {
					score = 0;
				}
			}
		}

	}

	private void saut(ElemManege obs) {
		double diff = 225 * cav.getTailleCheval() * obs.getTailleDiff() + cav.getVitesse() * obs.getVitesseDiff();
		double probaChute = 1.0 / 1000 * 0.02 * diff;
		double probaBarreTomb = 1.0 / 1000 * 0.13 * diff;
		double probaBarreTouch = 1.0 / 1000 * 0.35 * diff;
		double chance = Math.random();
		if (chance < probaChute) {
			abandon = true;
			System.out.println("chute, ABANDON");
		}
		if (chance >= probaChute && chance < probaBarreTomb + probaChute)
			score += 4;
		if (chance >= probaBarreTomb + probaChute && chance < probaBarreTomb + probaChute + probaBarreTouch)
			score += 2;
	}

	public void passage() {
		for (int i = 0; i < par.size(); i++) {
			ElemManege obs = par.getElem(i);
			if (obs != null) {
				saut(obs);
			}
			if (abandon)
				break;
		}
	}
}
