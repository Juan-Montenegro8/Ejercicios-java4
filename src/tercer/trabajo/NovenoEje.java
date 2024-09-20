package tercer.trabajo;

import java.util.Scanner;

public class NovenoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese la base");
            int base=textoScanner.nextInt();
            System.out.println("ingrese exponente");
            int exponente=textoScanner.nextInt();
            
            int contador=1;
        
            if(exponente>=0){
        
                for (int i = 1; i <=exponente; i++) {
            
                    contador*=base;
            
                }
                System.out.println("el resdulatdo es "+contador);
            }else{
                for (int i = -1; i >=exponente; i--) {
            
                    contador*=base;
                
                }
                System.out.println("el resdulatdo es 1/"+contador);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    
}
