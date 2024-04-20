package tercer.trabajo;

import java.util.Scanner;

public class TercerEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        double n=t.nextDouble();
        
        double cont=0;
        int sw=1;
        if(n>1){
            for(double i=1;i<=n;i+=2){
                if(sw==1){
                    cont=cont+1.0/i;   
                    sw=0;
                }else{
                    cont=cont-1.0/i;   
                    sw=1;
                }            
            }
        }else{
            System.out.println("el numero tiene que ser mayor a 1");
        }
    }
    
}
