package fibonaci;
import java.util.Scanner;

public class Fibonaci {

  
    public static void main(String[] args) {
       System.out.print("Masukan angka : ");
        int inp = new Scanner(System.in).nextInt();
        int total=0;
        int jumlah[] = new int[100];
        System.out.println("");
        System.out.println("");
        System.out.println("Hasil : ");
        for(int i=1;i<=inp;i++){
            jumlah[i]=fibonacciRecusion(i);
        }
        for(int i=inp;i>=1;i--){
            System.out.print(jumlah[i]+" ");
        }
    }
    public static int fibonacciRecusion(int number){
        if(number == 1||number==2){
            return 1;
        }
        return fibonacciRecusion(number-1)+fibonacciRecusion(number-2);
    }
    
}
