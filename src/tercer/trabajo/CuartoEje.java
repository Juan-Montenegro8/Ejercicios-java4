package tercer.trabajo;

import java.util.Scanner;

public class CuartoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        double numero=textoScanner.nextDouble();
        double contador1=0,contador2=2;
        do{
            contador1=numero%contador2;
            contador2++;
        }while(contador1!=0 && contador2<numero);
        
        
        if(contador1==0){
            System.out.println("no es primo");
        }else{
            System.out.println("es primo");
        }
            
    }
    
}
