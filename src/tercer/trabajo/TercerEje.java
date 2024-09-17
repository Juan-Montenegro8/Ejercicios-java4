package tercer.trabajo;

import java.util.Scanner;

public class TercerEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            double numero=textoScanner.nextDouble();
            
            double contador=0;
            int cambio=1;
            if(numero>1){
                for(double i=1;i<=numero;i+=2){
                    if(cambio==1){
                        contador=contador+1.0/i;   
                        cambio=0;
                    }else{
                        contador=contador-1.0/i;   
                        cambio=1;
                    }            
                }
                System.out.println(contador);
            }else{
                System.out.println("el numero tiene que ser mayor a 1");
            }  
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
