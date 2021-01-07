/**
 * 
 */
package cso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
	private static int cpt = 0;
	private int id;
	private BufferedWriter bw;
	private File file;
	private FileWriter fw;

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
		cpt++;
		id = cpt;
		try {
			file = new File("passage" + id + ".txt");
			file.createNewFile();
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param obs
	 * @return Des informations sur le saut
	 */
	private String saut(ElemManege obs) {
		double diff = 225 * cav.getTailleCheval() * obs.getTailleDiff() + cav.getVitesse() * obs.getVitesseDiff();
		double probaChute = 1.0 / 1000 * 0.02 * diff;
		double probaBarreTomb = 1.0 / 1000 * 0.13 * diff;
		double probaBarreTouch = 1.0 / 1000 * 0.35 * diff;
		double chance = Math.random();
		if (chance < probaChute) {
			abandon = true;
			return "chute, ABANDON";
		}
		if (chance >= probaChute && chance < probaBarreTomb + probaChute) {
			points += 4;
			return "Barre tombee";
		}
		if (chance >= probaBarreTomb + probaChute && chance < probaBarreTomb + probaChute + probaBarreTouch) {
			points += 2;
			return "Barre touchee";
		}
		return "Obstacle saute sans difficulte";
	}

	/**
	 * Le passage proprement dit.
	 */
	public void passage() {
		try {
			started = true;
			bw.write(toString() + "\n");
			for (int i = 0; i < par.size(); i++) {
				ElemManege obs = par.getElem(i);
				if (obs != null) {
					bw.write(saut(obs) + "\n");
				}
				if (abandon) {
					break;
				}
			}
			finished = true;
			bw.write(toString());
			par.afficher();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}

	@Override
	public String toString() {
		return "Passage [" + (cav != null ? "cav=" + cav + ", " : "") + "abandon=" + abandon + ", started=" + started
				+ ", finished=" + finished + ", points=" + points + ", id=" + id + "]";
	}

}
