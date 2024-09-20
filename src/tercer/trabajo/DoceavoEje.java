package tercer.trabajo;

import java.util.Scanner;

public class DoceavoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int numero=textoScanner.nextInt();
        
            int contador1 = 1;
            int contador2 = 0;
            if(numero>0){
                for(int i=1;i<=numero;i++){
            
                    contador1=contador1*i;            
                    contador2+=contador1;
                } 
                System.out.println("la sumatoria es "+contador2);
            }else{
                System.out.println("a numero negativo no se le saca afctorial");
            } 
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
