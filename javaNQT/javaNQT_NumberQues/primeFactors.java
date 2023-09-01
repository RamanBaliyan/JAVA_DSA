package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class primeFactors {
    static boolean isprime(int i){
        if(i==1)return false;
       
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    static void factors(int x){
        for(int i=1;i<=x;i++){
            if(x%i==0 && isprime(i)==true){
             
                System.out.println("Number is primefactor" + i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        factors(x);
    }
}
