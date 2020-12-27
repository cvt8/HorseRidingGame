package cso ;

public class Cavaliers {
	String nom;
	double tailleCheval;
	int score;
	public  Cavalier(String nom,float taille,int score) {
		this.nom=nom;
		this.tailleCheval=taille;
		this.score=score;
	}
	
	public Cavalier(String nom) {
		this.nom=nom;
		this.tailleCheval=(Math.random()*(1.60 - 1.80));
	}
	
	public void Saut(String TypeObstacle){
		// taille minimun de cheval de 1.60  
		switch(TypeObstacle) {
		  case "1er type obstacle": // Le plus petit si on le passe pas eliminatoire
			  if (tailleCheval== 1.60) {
				  
				    if ((Math.random()*100) > 30) // 70 pourcent de chance de sauter
				    	{
				    	score--;
				    }
				    else {
				    	score-=2;
				    	
				    }
				  }else if (tailleCheval==1.65) {
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
		  case "2eme type obtsacle": // Milieux de gammes 
			  if (tailleCheval== 1.60) {
				  
				    if ((Math.random()*100) > 30) // 70 pourcent de chance de sauter
				    	{
				    	score--;
				    }
				    else {
				    	score-=2;
				    	
				    }
				  }else if (tailleCheval==1.65) {
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
			  
			  if (tailleCheval== 1.60) {
				  
				    if ((Math.random()*100) > 30) // 60 pourcent de chance de sauter
				    	{
				    	score--;
				    }
				    else {
				    	score-=5;
				    	
				    }
				  }else if (tailleCheval==1.65) {
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
