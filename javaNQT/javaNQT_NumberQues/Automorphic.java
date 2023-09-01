package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class Automorphic {
    static int Square(int x){
        return x*x;

    }
    static void auto(int x){
        int r=0,s=0;
        int sqr=Square(x);
        while(x>0){
            r=sqr%10;
            s=x%10;
            
            if(r!=s){
                System.out.println("Number is not Automorphic");
                break;
            }
            else {sqr=sqr/10;
                x=x/10;}
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the number");
        int n= sc.nextInt();
        System.out.println("Enter the number");
        int x = sc.nextInt();
        auto(x);

    }
}
