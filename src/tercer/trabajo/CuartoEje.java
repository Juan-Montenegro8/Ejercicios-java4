package tercer.trabajo;

import java.util.Scanner;

public class CuartoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        double n=textoScanner.nextDouble();
        double cont=0,con=2;
        do{
            cont=n%con;
            con++;
        }while(cont!=0 && con<n);
        
        
        if(cont==0){
            System.out.println("no es primo");
        }else{
            System.out.println("es primo");
        }
            
    }
    
}
