package tercer.trabajo;

import java.util.Scanner;

public class NovenoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese la base");
        int base=t.nextInt();
        System.out.println("ingrese exponente");
        int exponente=t.nextInt();
        
        int cont=1;
        
        if(exponente>=0){
        
            for (int i = 1; i <=exponente; i++) {
            
                cont*=base;
            
            }
            System.out.println("el resdulatdo es "+cont);
        }else{
            for (int i = -1; i >=exponente; i--) {
            
                cont*=base;
            
            }
            System.out.println("el resdulatdo es 1/"+cont);
        }
    }
    
}
