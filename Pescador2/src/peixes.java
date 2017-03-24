import java.util.Scanner;

public class peixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double pp;
        double excesso;
        double multa;
        final double FATOR= 4;
        final double PM= 50;// peso maximo de peixes
        double total;
        //Scanner
        Scanner leitor= new Scanner(System.in);
        
        System.out.println("informe o peso dos peixes: ");
        pp = leitor.nextDouble(); 
        if(pp > 50)
       excesso = (pp - 50);
        else
        	excesso = 0;
        
        	multa= (excesso * FATOR );	    
        	System.out.println("Excesso: " + excesso);
        	System.out.println("o Valor da multa a ser paga é:" + multa);
        
        
        
      

        
        
        
        
	}

}
