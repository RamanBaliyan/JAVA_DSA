package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
           Scanner sc= new Scanner (System.in);
         System.out.println("Enter the number");
        int x = sc.nextInt();
        int dup=x;
        int sum=0;
        for(int i=1;i<dup;i++){
          if(dup%i==0){
            sum=sum+i;
          }
        }
        if(sum==x){
            System.out.println("Number is perfect");
        }
        else {
            System.out.println("Number is not perfect");
        }
    }
}
