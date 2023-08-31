package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class reverseDigit {
    static int reverseNumber(int n, int x){
        int sum=0,r=0;
        for(int i=0;i<n;i++){
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the number");
        int n= sc.nextInt();
         System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("After reverse the number Number will be " + reverseNumber(n,x));
       
    }
}
