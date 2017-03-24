import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//declaração de variavel
			float p;
			float h;
			double pd;
			
			
			Scanner leitor = new Scanner (System.in);//Scanner
				System.out.println("Informe seu Peso");
					p = leitor.nextFloat();
				System.out.println("Informe sua Altura");
					h = leitor.nextFloat();
				System.out.println(" ");
				System.out.println("Seu peso é: " + p +"Kg " + " Sua altura é: " + h);
				
				//Validação e Calculo de IMC
				
				if(p==50 && h==1.50){
					System.out.println(" ");
					System.out.println("Parabéns você está no seu peso ideal");
				
				}else if(p>50 && h==1.50){
					pd=(p-50);
					System.out.println(" ");
					System.out.println("Você está acima do peso, emagreça: " + pd + "Kg ");
					
				}else if(p<50 && h==1.50){
					pd=(50-p);
					System.out.println(" ");
					System.out.println("Você está abaixo do peso, engorde: " + pd + "Kg ");
					
				} if(p==70 && h>=1.50 && h<=1.90){
					System.out.println(" ");
					System.out.println("Parabéns você está no seu peso ideal");
					
				}else if(p>70 && h>1.50 && h<=1.90){
					pd=(p-70);
					System.out.println(" ");
					System.out.println("Você está acima do peso, emagreça: " + pd + "Kg ");
				
				}else if(p<70 && h>1.50 && h<=1.90){
					pd=(70-p);
					System.out.println(" ");
					System.out.println("Você está abaixo do peso, engorde: " + pd + "Kg ");
				
				}if(p==100 && h>1.90){
					System.out.println("");
					System.out.println("Parabéns você está no seu peso ideal");
					
				}else if(p>100 && h>1.90){
					pd=(p-100);
					System.out.println(" ");
					System.out.println("Você está acima do peso, emagreça: " + pd + "Kg ");
				
				}else if(p<100 && h>1.90){
					pd=(100-p);
					System.out.println(" ");
					System.out.println("Você está abaixo do peso, engorde: " + pd + "Kg ");
				}
				
				
			
			
			
			
			
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
	}

}
