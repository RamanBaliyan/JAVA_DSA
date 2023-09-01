package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class HarshadNo {
    static void harshad(int x){
    int r=0,d=0,sum=0;
    int dup=x;
     while(dup>0){
          r=dup%10;
     sum=sum+r;
     dup=dup/10; 
     } 
     if(x%sum==0){
         System.out.println("Number " +  x + " is harshad");
     } 
    }

     public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
         System.out.println("Enter the number");
        int x = sc.nextInt();
        harshad(x);
     }
}
