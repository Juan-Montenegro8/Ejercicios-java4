package tercer.trabajo;

import java.util.Scanner;

public class TreceaboEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            double numero1=textoScanner.nextDouble();
            System.out.println("ingrese el numero");
            double numero2=textoScanner.nextDouble();
                
            double contador1 =1;
            double contador2 =0;
        
            if(numero2>0 && numero1>0){
                for (int i = 1; i <=numero2; i++) {
                    contador1=contador1*i;
                    contador2+=numero1/contador1;
                }
                double resultado=contador2+1;
                System.out.println("el resultado es "+resultado);
            }else{
                System.out.println("no pueden ir numeros  negativos ni el 0");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error"+e.getMessage());
        }
    }
    
}
