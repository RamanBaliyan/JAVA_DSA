package javaNQT.javaNQT_NumberQues;
import java.util.Scanner;

public class factorial {

    static int factorialNo(int x){
        if(x==0)return 1;
        else return x*factorialNo(x-1);
        
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
         
    System.out.println(factorialNo(x));

    }
}
