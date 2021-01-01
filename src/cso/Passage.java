/**
 * 
 */
package cso;

/**
 * @author Lucas Zebre
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
	 * @param man
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

public void Saut(Obstacle random,Cavalier tou){
	// taille minimun de cheval de 1.60  
	switch(random.getId()) {
	  case 1: // Le plus petit si on le passe pas eliminatoire
		  if (tou.getTaille()== 1.60) {
			  
			    if ((Math.random()*100) > 30) // 70 pourcent de chance de sauter
			    	{
			    	score--;
			    }
			    else {
			    	score-=2;
			    	
			    }
			  }else if (tou.getTaille()==1.65) {
				  if ((Math.random()*100) > 25) // 75 pourcent de chance de sauter
				  {
				    	score--;
				    }
				  else {
					  score-=3;
				  }
			  }
			  else {
				  if ((Math.random()*100) > 20) {
				    	score--;
				    }else
				    {
				    	score-=4;
				    }
	    break;
	  case 2: // Milieux de gammes 
		  if (tou.getTaille()== 1.60) {
			  
			    if ((Math.random()*100) > 30) // 70 pourcent de chance de sauter
			    	{
			    	score--;
			    }
			    else {
			    	score-=2;
			    	
			    }
			  }else if (tou.getTaille()==1.65) {
				  if ((Math.random()*100) > 25) // 75 pourcent de chance de sauter
				  {
				    	score--;
				    }
				  else {
					  score-=3;
				  }
			  }
			  else {
				  if ((Math.random()*100) > 20) {
				    	score--;
				    }else
				    {
				    	score-=6;
				    }
	    break;
	  default:// 3eme type obstacle les plus haut 
		  
		  if (tou.getTaille()== 1.60) {
			  
			    if ((Math.random()*100) > 30) // 60 pourcent de chance de sauter
			    	{
			    	score--;
			    }
			    else {
			    	score-=5;
			    	
			    }
			  }else if (tou.getTaille()==1.65) {
				  if ((Math.random()*100) > 25) // 75 pourcent de chance de sauter
				  {
				    	score--;
				    }
				  else {
					  score-=10;;
				  }
			  }
			  else {
				  if ((Math.random()*100) > 20) {
				    	score--;
				    }else
				    {
				    	score=0;
				    }
	}
	
	  
	  
	}
}
