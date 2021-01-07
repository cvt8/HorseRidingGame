package cso;

import java.util.ArrayList;

/**
 * @author Lucas Zebre
 *
 */
public class TabCavaliers {
	private Cavalier ch1 = new Cavalier("Zingaro");
	private Cavalier ch2 = new Cavalier("Felous");
	private Cavalier ch3 = new Cavalier("Templado");
	private Cavalier ch4 = new Cavalier("Quijote");
	private Cavalier ch5 = new Cavalier("Tao");
	private Cavalier ch6 = new Cavalier("Nikito");
	private Cavalier ch7 = new Cavalier("Bucéphale");
	private Cavalier ch8 = new Cavalier("Marengo");
	private ArrayList<Cavalier> tab = new ArrayList<Cavalier>();

	/**
	 * 
	 */
	public TabCavaliers() {
		tab = new ArrayList<Cavalier>();
		tab.add(ch1);
		tab.add(ch2);
		tab.add(ch3);
		tab.add(ch4);
		tab.add(ch5);
		tab.add(ch6);
		tab.add(ch7);
		tab.add(ch8);
	}

	/**
	 * @param unk
	 */
	public void ajouteCavaliers(Cavalier unk) {
		tab.add(unk);
	}

	/**
	 * @return
	 */
	public ArrayList<Cavalier> getTab() {
		return tab;
	}
}
