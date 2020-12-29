/**
 * 
 */
package cso;
public class Maneges {
	
	public void Init(String[][] tab) {
		for(int i=0;i<tab.length;i++) {
			for(int u = 0;u<tab[i].length;u++) {
				switch(i) {
				  case 0:
					  tab[i][u]="-";
				    break;
				  case 3: //obstacle
					  if(u==0 || u==15) {
							tab[i][u]="|";
						 }
							else
							{
								tab[i][u]="-";
							}
					  break;
				  case 6: //obstacle
					  if(u==0 || u==15) {
							tab[i][u]="|";
						 }
							else
							{
								tab[i][u]="-";
							}
					  break;
				  case 9: //obstacle
					  if(u==0 || u==15) {
							tab[i][u]="|";
						 }
							else
							{
								tab[i][u]="-";
							}
					  break;
				  case 12: //obstacle
					  if(u==0 || u==15) {
							tab[i][u]="|";
						 }
							else
							{
								tab[i][u]="-";
							}
					  break;
				  case 15: // obstacle
					  if(u==0 || u==15) {
							tab[i][u]="|";
						 }
							else
							{
								tab[i][u]="-";
							}
					  break;
					  
				  case 19: // fin
					tab[i][u]="-";
						 
				    break;
				  default:
					  if(u==0 || u==15) {
							tab[i][u]="|";
						 }
							else
							{
								tab[i][u]=" ";
							}
				}
				
			
				
			}
		}
	}
	
		
	
	public void afficher(String[][] tab) {
		System.out.println("Depart");
		for (int i=0;i<tab.length;i++) {
			for(int u=0;u<tab[i].length;u++) {
				System.out.print(tab[i][u]);
			}
			System.out.println();
		}
		System.out.println("Arrivé");
	}

}
