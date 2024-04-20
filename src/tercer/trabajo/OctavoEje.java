package tercer.trabajo;

import java.util.Scanner;

public class OctavoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=t.nextInt();
        System.out.println("ingrese numero multiplicador");
        int n1=t.nextInt();
        
        int cont=0;
                
        if(n>n1){
            cont=n%n1;
            if(cont==0){
                System.out.println("el m.c.d. es "+n1);
            }
            while(cont==0){
                cont=n1%cont;
            }
            if(cont==0){
                System.out.println("el m.c.d. es "+cont);
            }
        }else{
            if(n1>n){
               cont=n1%n;
            if(cont==0){
                System.out.println("el m.c.d. es "+n);
            }
            while(cont==0){
                cont=n%cont;
            }
            if(cont==0){
                System.out.println("el m.c.d. es "+cont);
            } 
            }else{
                System.out.println("los numeros son iguales");
            }
        }
        
    }
    
}
