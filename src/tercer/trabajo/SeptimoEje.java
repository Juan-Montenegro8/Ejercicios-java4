package tercer.trabajo;

import java.util.Scanner;

public class SeptimoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int numero1=textoScanner.nextInt();
            System.out.println("ingrese numero multiplicador");
            int numero2=textoScanner.nextInt();
        
            int contador=numero1;
                
            for(int i=1;i<numero2;i++){
                numero1+=contador;
            }

            System.out.println("la multiplicacion es "+numero1);
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e.getMessage());
        }
        
    }
    
}
