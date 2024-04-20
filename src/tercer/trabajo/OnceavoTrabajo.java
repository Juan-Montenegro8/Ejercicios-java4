package tercer.trabajo;

import java.util.Scanner;

public class OnceavoTrabajo {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        double n=t.nextDouble();
        
               
        for (int i = 1; i <=n; i++) {
        double cont=0,con=2;    
            do{
                cont=i%con;
                con++;
            }while(cont!=0 && con<i);
            if(cont!=0){
                System.out.println(i+" es primo");
            }
        }             
        
    }
    
}
