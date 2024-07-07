package tercer.trabajo;

import java.util.Scanner;

public class SextoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=textoScanner.nextInt();
        System.out.println("ingrese numero divisor");
        int n1=textoScanner.nextInt();
        
        int cont =0;
        
        if(n1<n || n1<=0 || n<=-1){
            System.out.println("no se puede dividir");
        }else{
            while(n>n1){
                n=n-n1;
                cont++;
            }
            
            System.out.println("la division es "+cont+" y el residuo es "+n);
        }
    }
    
}
