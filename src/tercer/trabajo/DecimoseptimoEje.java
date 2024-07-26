package tercer.trabajo;

import java.util.Scanner;

public class DecimoseptimoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int numero=textoScanner.nextInt();
        
        System.out.println("lso primeros "+numero+" numeros cuadrados son");
        for (int i = 1; i <=numero; i++) {
            int contador=i*i;
            System.out.println(i+" x "+i+" = "+contador);
        }
    }
    
}

