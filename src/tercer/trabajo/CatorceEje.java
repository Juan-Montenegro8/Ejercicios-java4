package tercer.trabajo;

import java.util.Scanner;

public class CatorceEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero=textoScanner.nextInt();
        
        int invertido=0;
        if(numero>0){
        while(numero>0){
            int resultado =numero%10;
            numero/=10;
            invertido+=resultado;
        }
        System.out.println("invertido es "+invertido);
        }else{
            System.out.println("numeros superiores a 0");
        }
    }
    
}
