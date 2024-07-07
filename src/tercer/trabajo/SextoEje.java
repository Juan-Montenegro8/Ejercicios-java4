package tercer.trabajo;

import java.util.Scanner;

public class SextoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero1=textoScanner.nextInt();
        System.out.println("ingrese numero divisor");
        int numero2=textoScanner.nextInt();
        
        int division =0;
        
        if(numero2<numero1 || numero2<=0 || numero1<=-1){
            System.out.println("no se puede dividir");
        }else{
            while(numero1>numero2){
                numero1=numero1-numero2;
                division++;
            }
            
            System.out.println("la division es "+division+" y el residuo es "+numero1);
        }
    }
    
}
