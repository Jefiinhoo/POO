import java.util.Scanner;

public class ImpostodeRenda {

	public static void main(String[] args) {
		double rl;
		double ir = 0;
		double rh;
		double rm;
		double rc;
		final double INSS = 0.8;
		final double DESC = 20;
		
		Scanner leitor = new Scanner(System.in);
			System.out.println("Digite a Renda do homem");
				rh = leitor.nextDouble();
			System.out.println("Digite a Renda da mulher");
				rm = leitor.nextDouble();
			rc = (rh + rm);
				System.out.println("A renda conjunta é de: " + rc);
			
				if(rc>900.0 && rc<1500) {
					ir = ((rh + rm)*0.10);
					rl = (ir*INSS+DESC);
					System.out.println("O imposto de renda é de: " + ir + " ,A aliquota é de: 10% e a renda liquida é de: " + rl );
					
					}
					else if(rc>=1500 && rc<=2500.00) {
						ir = ((rh + rm)*0.15);
						rl = (ir*INSS+DESC);
						System.out.println("O imposto de renda é de: " + ir + " ,A aliquota é de: 15% e a renda liquida é de: " + rl);
					}
					else if(rc>2500)
							ir = ((rh + rm)*0.25);
						rl = (ir*INSS+DESC);
						System.out.println("O imposto de renda é de: " + ir +" ,A aliquota é de: 20% e a renda liquida é de: " + rl);
						
					{		
							
					

						
						
						
						
						
						
						
						
						
				}
							
				
					
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}			
	
