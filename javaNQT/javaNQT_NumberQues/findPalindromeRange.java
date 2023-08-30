package javaNQT.javaNQT_NumberQues;

import java.util.Scanner;

public class findPalindromeRange {
    public static void checkPalindrome(int x,int y,int n){
        for(int i=x;i<y;i++){
            int r=0,d=0,sum=0;
           int dup=i;
            for(int j=0;j<n;j++){
                 r=dup%10;
            sum=sum*10+r;
            dup=dup/10; 
            } 
            if(sum==i){
                System.out.println("Number " +  i + "is palindrome");
            } 
            
        }
}
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the number");
        int n= sc.nextInt();
         System.out.println("Enter the starting number");
        int x = sc.nextInt();
        System.out.println("Enter the ending number");
        int y = sc.nextInt();
        checkPalindrome(x,y,n);
        
    }
}
