package cso ;

public class Cavalier {
	String nom;
	int x;
	int y;
	float tailleCheval;
	 int point;
	public  Cavalier(String nom,int x,int y,float taille,int point) {
		this.nom=nom;
		this.x=x;
		this.y=x;
		this.tailleCheval=taille;
		this.point=point;
	}
	
	public void Saut(){
		
		  if (tailleCheval== 1.60) {
			  
		    if ((Math.random()*100) > 30) // 70 pourcent de chance de sauter
		    	{
		    	point--;
		    }
		    else {
		    	point=0;
		    	
		    }
		  }else if (tailleCheval==1.65) {
			  if ((Math.random()*100) > 25) // 75 pourcent de chance de sauter
			  {
			    	point--;
			    }
			  else {
				  point=0;
			  }
		  }
		  else {
			  if ((Math.random()*100) > 20) {
			    	point--;
			    }else
			    {
			    	point=0;
			    }
		  
		}
		
		
		
	}
	
	
	
	public String getNom(){
		// methode retournant le nom
		return nom ;
	}
	
	

}
