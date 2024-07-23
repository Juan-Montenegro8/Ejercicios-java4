package tercer.trabajo;

import java.util.Scanner;

public class CatorceEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=textoScanner.nextInt();
        
        int in=0;
        if(n>0){
        while(n>0){
            int r =n%10;
            n/=10;
            in+=r;
        }
        System.out.println("invertido es "+in);
        }else{
            System.out.println("numeros superiores a 0");
        }
    }
    
}
