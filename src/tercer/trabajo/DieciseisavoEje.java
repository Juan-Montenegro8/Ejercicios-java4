package tercer.trabajo;

import java.util.Scanner;

public class DieciseisavoEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        int n=textoScanner.nextInt();
        
        int cont = 0 , con =1 , co=1;
        if(n>0){
            for(int i=0;i<=n;i++){
            
                System.out.println(co);
                co=cont+con;                            
                cont=con;
                con=co;
            }                        
        }else{
            System.out.println("numero superior a 0");
        }
    }
    
}
