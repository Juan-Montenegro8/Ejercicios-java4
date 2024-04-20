package tercer.trabajo;

import java.util.Scanner;

public class SeptimoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=t.nextInt();
        System.out.println("ingrese numero multiplicador");
        int n1=t.nextInt();
        
        int cont=n;
                
        for(int i=1;i<n1;i++){
            n+=cont;
        }
            
        System.out.println("la multiplicacion es "+n);
        
    }
    
}
