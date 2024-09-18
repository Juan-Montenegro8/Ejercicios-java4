package tercer.trabajo;

import java.util.Scanner;

public class QuintoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int numero=textoScanner.nextInt();
        
            int invertido=0;
        
            while(numero>0){
                int contenedor =numero%10;
                invertido=invertido*10+contenedor;
                numero/=10;
                System.out.println(invertido);
            }
            System.out.println("invertido es "+invertido);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
