package tercer.trabajo;

import java.util.Scanner;

public class DecimoseptimoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=textoScanner.nextInt();
        
        System.out.println("lso primeros "+n+" numeros cuadrados son");
        for (int i = 1; i <=n; i++) {
            int cont=i*i;
            System.out.println(i+" x "+i+" = "+cont);
        }
    }
    
}

