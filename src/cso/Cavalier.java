package cso;

public class Cavalier {
	private String nom;
	private double tailleCheval;
	private int score;

	public Cavalier(String nom, float taille, int score) {
		this.nom = nom;
		this.tailleCheval = taille;
		this.score = score;
	}

	public Cavalier(String nom){
		this.nom=nom;
		this.tailleCheval= 1.48 + Math.random()*(1.8 - 1.48);
	} // l'IDE signale une erreur ici. Bizarre. Par ailleurs, un cheval reglementaire
		// doit faire plus de 1,48 m.

	public void saut(String TypeObstacle){
		// taille minimun de cheval de 1.48  
		switch(TypeObstacle) {
		  case "1er type obstacle" :// Le plus petit si on le passe pas eliminatoire
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
		    break ;
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
		    break ;
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
				  }
}