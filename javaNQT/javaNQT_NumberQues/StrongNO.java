package javaNQT.javaNQT_NumberQues;
import java.util.Scanner;

public class StrongNO {
     static int fact(int r){
        int temp=1;
        for(int i=1;i<=r;i++){
            temp=temp*i;
    
        }
        return temp;
    }
    
    static void strong(int x,int n){
        int r=0,sum=0;
        int temp=x;
        for(int i=0;i<n;i++){
            r=x%10;
            sum=sum+fact(r);
            x=x/10;
        }
        if(sum==temp){
            System.out.println("The given number is strong number");
        }
        else System.out.println("The given number is not strong number");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the number");
        int n= sc.nextInt();
        System.out.println("Enter the number");
        int x = sc.nextInt();
        strong(x,n);

    }
}
