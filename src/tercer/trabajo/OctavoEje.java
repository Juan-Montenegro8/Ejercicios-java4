package tercer.trabajo;

import java.util.Scanner;

public class OctavoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int numero1=textoScanner.nextInt();
            System.out.println("ingrese numero multiplicador");
            int numero2=textoScanner.nextInt();
        
            int contador=0;
                
            if(numero1>numero2){
                contador=numero1%numero2;
                if(contador==0){
                    System.out.println("el m.c.d. es "+numero2);
                }
                while(contador==0){
                    contador=numero2%contador;
                }
                if(contador==0){
                    System.out.println("el m.c.d. es "+contador);
                }
            }else{
                if(numero2>numero1){
                   contador=numero2%numero1;
                if(contador==0){
                    System.out.println("el m.c.d. es "+numero1);
                }
                while(contador==0){
                    contador=numero1%contador;
                }
                if(contador==0){
                    System.out.println("el m.c.d. es "+contador);
                } 
                }else{
                    System.out.println("los numeros son iguales");
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }

    }
    
}
