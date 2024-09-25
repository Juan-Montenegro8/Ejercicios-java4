package tercer.trabajo;

import java.util.Scanner;

public class DecimoseptimoEje {

    public static void main(String[] args) {
        
        
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int number=textoScanner.nextInt();
        
            System.out.println("los primeros "+number+" numeros cuadrados son");
            for (int i = 1; i <=number; i++) {
                int count=i*i;
                System.out.println(i+" x "+i+" = "+count);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}

