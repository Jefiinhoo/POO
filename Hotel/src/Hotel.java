import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double dias = 0;
					double Total;
						String nome; 
							Scanner leitor= new Scanner(System.in);
	
		  	System.out.println("Informe o Nome do Cliente:");
		  		nome= leitor.next();
		  			System.out.println("Informe quantos dias o Cliente " + nome + " ficou hospedado");
		  				dias= leitor.nextDouble();
		  					
		  					if(dias<15){
		  						Total=(300+20);
		  							System.out.println("O total a pagar é igual a " + Total);
		  				}
		  				
		  				if(dias==15){
		  					Total=(300+14);
		  						System.out.println("O total a pagar é igual a " + Total);
		  				}
		  				
		  				if(dias>15){
		  					Total= (300+12);
		  						System.out.println("O total a pagar é igual a  " + Total);
		  				}
		  				
		  				
	
	}

}
