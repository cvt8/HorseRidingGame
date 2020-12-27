

import java.util.ArrayList;

public class TabCavaliers {
	Cavaliers ch1=new Cavaliers("Zingaro");
	Cavaliers ch2=new Cavaliers("Felous");
	Cavaliers ch3=new Cavaliers("Templado");
	Cavaliers ch4=new Cavaliers("Quijote");
	Cavaliers ch5=new Cavaliers("Tao");
	Cavaliers ch6=new Cavaliers("Nikito");
	Cavaliers ch7=new Cavaliers("Bucéphale");
	Cavaliers ch8=new Cavaliers("Marengo");
	ArrayList<Cavaliers> Tab=new ArrayList<Cavaliers>();

	public void AjouteCavaliers(Cavaliers unk) {
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
	
	public ArrayList<Cavaliers> getTab() {
		return Tab;
	}

}
