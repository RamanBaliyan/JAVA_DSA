package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class checkPrimeNoRange {
    static void checkPrime(int x){
        boolean check=false;
        for(int j=2;j<=Math.sqrt(x);j++){
            if(x%j==0){
                check=false;
                break;
            }
            else{
                check=true;
            }
        }
        if(check==true){
            System.out.println(x);
        }
    } 
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
         System.out.println("Enter the starting number");
        int x = sc.nextInt();
        System.out.println("Enter the ending number");
        int y = sc.nextInt();
        for(int i=x;i<y;i++){
        checkPrime(i);
        }
    }
}
