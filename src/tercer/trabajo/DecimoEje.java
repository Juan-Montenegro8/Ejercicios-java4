package tercer.trabajo;

import java.util.Scanner;

public class DecimoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero=textoScanner.nextInt();
        
        int contador = 1;
        if(numero>0){
            for(int i=1;i<=numero;i++){
            
                contador=contador*i;            
                System.out.println("el factorial del numero "+i+" es "+contador);
            }                        
        }else{
            System.out.println("a numero negativo no se le saca afctorial");
        }          
    }
    
}
