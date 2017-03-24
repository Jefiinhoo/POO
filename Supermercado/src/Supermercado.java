import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		double VP;// Valor produto
		double DM;// Dias do mercado
		double reajuste;
		double VM;// Venda mensal
		double total;
		Scanner leitor= new Scanner(System.in);

		System.out.println("Insira quantos dias funciona o mercado no Mês: ");
		DM= leitor.nextDouble();
		
		System.out.println("Insira o preço do produto: ");
		VP= leitor.nextDouble();
		
		VM= (DM*VP);
			
		if(VM<=500 && VP<=30){
		reajuste= (VM*0.1);
		total= (VP+reajuste);
		System.out.println("O produto teve um reajuste de " + reajuste);
		System.out.println("O novo valor a pagar é de: " + total + " R$" );
		}
		
		if(VM>=500 && VP>=30 || VP<60){
		reajuste=(VM*0.15);
		total=(VP+reajuste);
		System.out.println("O produto teve um reajuste de " + reajuste);
		System.out.println("O novo valor a pagar é de R$ " + total );
		}
	
		if(VM>=1200 && VP>=80){
		reajuste=(VM*0.2);
		total=(VP-reajuste);
		System.out.println("O produto teve um reajuste de " + reajuste);
		System.out.println("O novo valor do produto é de R$ " + total );
			
		}
	}

}
