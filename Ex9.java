package listaF;

import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        
        System.out.println(" Digite um n�mero");
        int n = leia.nextInt();
        
        if (n % 4 == 0 & n % 5 == 0){
            System.out.print(" N�mero � divisivel por 4 e 5");           
        }else {
            System.out.print(" N�mero n�o � divisivel por 4 e 5");        }
    }
    
}