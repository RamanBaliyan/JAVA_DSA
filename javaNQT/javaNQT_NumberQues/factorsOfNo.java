package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class factorsOfNo {
     static void factors(int x){
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.println("Number is factor" + i);
            }
        }
    }
    public static void main(String[] args) {
         System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        factors(x);
    }
}
