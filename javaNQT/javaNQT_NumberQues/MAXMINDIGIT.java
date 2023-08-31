package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class MAXMINDIGIT {
    static void findMinMax(int n, int x){
        int sum=0,r=0;
        int min=Integer. MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            r=x%10;
            min=Math.min(min,r);
            max=Math.max(max,r);
            x=x/10;
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the number");
        int n= sc.nextInt();
         System.out.println("Enter the number");
        int x = sc.nextInt();
        findMinMax(n,x);
    }
}
