package tercer.trabajo;

import java.util.Scanner;

public class QuinceEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero=textoScanner.nextInt();
        
        int invertido=0;
        if(numero>0){
        while(numero>0){
            int resultado =numero%10;
            numero/=10;
            int contador=0;
            for(int i=1;i<=resultado;i++){
            
                contador=contador+i;            
            }
            invertido+=contador;
        }
        System.out.println("invertido es "+invertido);
        }else{
            System.out.println("numeros superiores a 0");
        }
    }
    
}
