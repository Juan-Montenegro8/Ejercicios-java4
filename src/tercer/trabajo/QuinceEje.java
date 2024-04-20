package tercer.trabajo;

import java.util.Scanner;

public class QuinceEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=t.nextInt();
        
        int in=0;
        if(n>0){
        while(n>0){
            int r =n%10;
            n/=10;
            int cont=0;
            for(int i=1;i<=r;i++){
            
                cont=cont+i;            
            }
            in+=cont;
        }
        System.out.println("invertido es "+in);
        }else{
            System.out.println("numeros superiores a 0");
        }
    }
    
}
