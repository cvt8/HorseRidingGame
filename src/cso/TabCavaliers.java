package cso;

import java.util.ArrayList;

public class TabCavaliers {
	Cavalier ch1 = new Cavalier("Zingaro");
	Cavalier ch2 = new Cavalier("Felous");
	Cavalier ch3 = new Cavalier("Templado");
	Cavalier ch4 = new Cavalier("Quijote");
	Cavalier ch5 = new Cavalier("Tao");
	Cavalier ch6 = new Cavalier("Nikito");
	Cavalier ch7 = new Cavalier("Bucéphale");
	Cavalier ch8 = new Cavalier("Marengo");
	static ArrayList<Cavalier> Tab = new ArrayList<Cavalier>();

	private TabCavaliers() {
	}

	public void ajouteCavaliers(Cavalier unk) {
		Tab.add(unk);
	}

	public void makeTab() {
		Tab.add(ch1);
		Tab.add(ch2);
		Tab.add(ch3);
		Tab.add(ch4);
		Tab.add(ch5);
		Tab.add(ch6);
		Tab.add(ch7);
		Tab.add(ch8);
	}

	public ArrayList<Cavalier> getTab() {
		return Tab;
	}

}
