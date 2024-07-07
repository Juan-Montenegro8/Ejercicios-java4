package tercer.trabajo;

import java.util.Scanner;

public class QuintoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero=textoScanner.nextInt();
        
        int in=0;
        
        while(numero>0){
            int r =numero%10;
            in=in*10+r;
            numero/=10;
            System.out.println(in);
        }
        System.out.println("invertido es "+in);
    }
    
}
