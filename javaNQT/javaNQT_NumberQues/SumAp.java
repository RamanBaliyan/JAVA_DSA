package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class SumAp {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
         System.out.println("Enter the common difference");
        int d = sc.nextInt();
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+a;
            a=a+d;
        }
        System.out.println(sum);
    }
}
