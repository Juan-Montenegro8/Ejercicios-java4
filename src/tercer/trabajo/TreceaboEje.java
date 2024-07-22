package tercer.trabajo;

import java.util.Scanner;

public class TreceaboEje {

    public static void main(String[] args) {
        Scanner textoScanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero");
        double x=textoScanner.nextDouble();
        System.out.println("ingrese el numero");
        double n=textoScanner.nextDouble();
                
        double cont =1;
        double con =0;
        
        if(n>0 && x>0){
            for (int i = 1; i <=n; i++) {
                cont=cont*i;
                con+=x/cont;
            }
            double re=con+1;
            System.out.println("el resdultado es "+re);
        }else{
            System.out.println("no pueden ir numeros  negativos ni el 0");
        }
    }
    
}
