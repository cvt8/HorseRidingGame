package cso ;

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
		i++; // compteur permettant de connaitre le nombre de cheval pr��sent 
	}
	
	public void Saut(){
		
		  if (tailleCheval== 1.60) {
			  
		    if (Math.random() > 0.03) {
		    	// action  sur le saut obstacle 
		    }
		    else {
		    	
		    }
		  }else if (tailleCheval==1.65) {
			  if (Math.random() > 0.002) {
			    	// action sur le saut obstacle
			    }
			  else {
				  
			  }
		  }
		  else {
			  if (Math.random() > 0.001) {
			    	// action sur le saut obstacle
			    }else
			    {
			    	
			    }
		  
		}
		
		
		
	}
	
	
	
	public String getNom(){
		// methode retournant le nom
		return nom ;
	}
	public void bouger() {
		// methode faisant bouger le cavalier sur le parcours utilisant random pour savoir de combien ils avan��ent 
		// ou si ils chutent etc ...
	}
	

}
