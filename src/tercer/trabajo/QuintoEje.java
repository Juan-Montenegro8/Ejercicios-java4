package tercer.trabajo;

import java.util.Scanner;

public class QuintoEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=t.nextInt();
        
        int in=0;
        
        while(n>0){
            int r =n%10;
            in=in*10+r;
            n/=10;
            System.out.println(in);
        }
        System.out.println("invertido es "+in);
    }
    
}
