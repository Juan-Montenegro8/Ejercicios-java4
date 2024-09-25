package tercer.trabajo;

import java.util.Scanner;

public class DieciseisavoEje {

    public static void main(String[] args) {
        
        try (Scanner textoScanner=new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            int numero=textoScanner.nextInt();
        
            int contador0 = 0 , contador1 =1 , contador2=1;
            if(numero>0){
                for(int i=0;i<=numero;i++){
                
                    System.out.println(contador2);
                    contador2=contador0+contador1;                            
                    contador0=contador1;
                    contador1=contador2;
                }                        
            }else{
                System.out.println("numero superior a 0");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error:  "+e.getMessage());
        }
    }
    
}
