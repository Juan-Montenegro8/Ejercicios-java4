package tercer.trabajo;

import java.util.Scanner;

public class SegundoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int numero=textoScanner.nextInt();
        
            int contador = 0;
            if(numero>=0){
                for(int i=1;i<=numero;i++){
            
                    contador=contador+i;            
                }
            }else{
                for(int i=-1;i>=numero;i--){
            
                    contador=contador-i;            
                }
            }
            System.out.println("la sumatoria del numero "+numero+" es "+contador);
        } catch (Exception e) {
                System.out.println("Ocurrio un error "+e.getMessage());
        }
    }
    
}
