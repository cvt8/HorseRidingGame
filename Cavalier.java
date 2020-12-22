
public class Cavalier {
	String nom;
	int x;
	int y;
	float tailleCheval;
	static int i=0;
	public  Cavalier(String nom,int x,int y,float taille) {
		this.nom=nom;
		this.x=x;
		this.y=x;
		this.tailleCheval=taille;
		i++; // compteur permettant de connaitre le nombre de cheval présent 
	}
	
	public void Saut(){
		
		  if (tailleCheval== 1.60) {
			  
		    if (ramdon() > 0.03) {
		    	// action  sur le saut obstacle 
		    }
		    else {
		    	
		    }
		  }else if (tailleCheval==1.65) {
			  if (ramdon() > 0.002) {
			    	// action sur le saut obstacle
			    }
			  else {
				  
			  }
		  }
		  else {
			  if (ramdon() > 0.001) {
			    	// action sur le saut obstacle
			    }else
			    {
			    	
			    }
		  
		}
		
		
		
	}
	
	
	
	public getNom(){
		// methode retournant le nom
	}
	public bouger() {
		// methode faisant bouger le cavalier sur le parcours utilisant random pour savoir de combien ils avançent 
		// ou si ils chutent etc ...
	}
	

}
