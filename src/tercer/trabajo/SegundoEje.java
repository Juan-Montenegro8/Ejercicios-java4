package tercer.trabajo;

import java.util.Scanner;

public class SegundoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=textoScanner.nextInt();
        
        int cont = 0;
        if(n>=0){
            for(int i=1;i<=n;i++){
            
                cont=cont+i;            
            }
        }else{
            for(int i=-1;i>=n;i--){
            
                cont=cont-i;            
            }
        }
        System.out.println("la sumatoria del numero "+n+" es "+cont);
    }
    
}
