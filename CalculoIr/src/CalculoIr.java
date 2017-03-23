import java.util.Scanner;

public class CalculoIr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  Ir, renda;
		double total;
		final double Des= 600;
		String nome;
		Scanner leitor= new Scanner(System.in);
		  
		
			System.out.println("Insira Seu nome: ");
				nome= leitor.next();
		
					System.out.println( nome + " Insira sua renda Anual: ");
						renda= leitor.nextDouble();
		
							if(renda<=10000){
								System.out.println(nome + " , Você está isento.");	
							}
		
								if(renda>=10000 && renda<=30000){
									Ir= (renda-Des)*0.05;
										System.out.println(nome + " Sua Renda Anual é de: " + Ir);
								}
									if(renda>=30000 && renda<=60000){
										Ir=(renda-Des)*0.1;
											System.out.println(nome + " Sua Renda Anual é de: " + Ir);
									}	
									
									if(renda>60000){
									Ir=(renda-Des)*0.15;
									System.out.println(nome + " Sua renda Anual é de: " + Ir);
									}
}

}
