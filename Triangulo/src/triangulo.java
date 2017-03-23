import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double lado1;
        double lado2;
        double lado3;
        
        //Scanner
        Scanner leitor= new Scanner(System.in);
        
        System.out.println("informe o primeiro lado: ");
        lado1= leitor.nextDouble();
        System.out.println("informe o segundo lado: ");
        lado2= leitor.nextDouble();
        System.out.println("informe o terceiro lado: ");
        lado3= leitor.nextDouble();
        
        if(lado1==lado2){
          if(lado2==lado3){
        	  System.out.println("esse triangulo é Equilátero");	  
          }
          
     	}
        
        if((lado1!=lado2 && lado2==lado3) ||(lado3!=lado1 && lado2==lado1) ){
        
        						System.out.println("Esse triangulo é Isóceles");
        }
       
        if(lado1!=lado2){
        	if(lado3!=lado1){
        		System.out.println("Esse triangulo é Escaleno");	
       
        	}
        }

	}
}
