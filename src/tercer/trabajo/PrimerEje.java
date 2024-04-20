package tercer.trabajo;

import java.util.Scanner;

public class PrimerEje {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=t.nextInt();
        
        int cont = 1;
        if(n>0){
            for(int i=1;i<=n;i++){
            
                cont=cont*i;            
            }
            
            System.out.println("el factorial del numero es "+cont);
        }else{
            System.out.println("a numero negativo no se le saca afctorial");
        }
    }
    
}
