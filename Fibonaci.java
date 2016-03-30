package fibonaci;
import java.util.Scanner;

public class Fibonaci {

  
    public static void main(String[] args) {
        System.out.print("Masukan angka : ");
        int inp = new Scanner(System.in).nextInt();
        int total=0;
        System.out.println("");
        System.out.println("");
        System.out.println("Hasil : ");
        for(int i=1;i<=inp;i++){
            System.out.print(fibonacciRecusion(i)+" ");
        }
    }
    public static int fibonacciRecusion(int number){
        if(number == 1||number==2){
            return 1;
        }
        return fibonacciRecusion(number-1)+fibonacciRecusion(number-2);
    }
    
}
