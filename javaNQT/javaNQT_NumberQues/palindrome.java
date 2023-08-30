package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the number");
        int n= sc.nextInt();
         System.out.println("Enter the number");
        int x = sc.nextInt();
        int r=0,d=0,sum=0;
        int duplicate=x;
        for(int i=0;i<n;i++){
            r=duplicate%10;
            sum=sum*10+r;
            duplicate=duplicate/10;  
        }
        if(sum==x){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
