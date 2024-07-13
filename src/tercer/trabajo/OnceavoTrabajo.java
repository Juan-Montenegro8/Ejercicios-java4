package tercer.trabajo;

import java.util.Scanner;

public class OnceavoTrabajo {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        double numero=textoScanner.nextDouble();
        
               
        for (int i = 1; i <=numero; i++) {
        double contador1=0,contador2=2;    
            do{
                contador1=i%contador2;
                contador2++;
            }while(contador1!=0 && contador2<i);
            if(contador1!=0){
                System.out.println(i+" es primo");
            }
        }             
        
    }
    
}
