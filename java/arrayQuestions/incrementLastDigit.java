package arrayQuestions;
import java.util.*;
public class incrementLastDigit {
    public static void incrementor(int a[]){
        int len=a.length;
        a[len-1]=a[len-1]+1;
        for(int i=0;i<len;i++){
            System.out.print(a[i] + ",");
        }
    }

    public static void main(String[] args) {
           Scanner s= new Scanner(System.in);
       // System.out.println("Enter the target value");
       // int target=s.nextInt();
        System.out.println("Enter the no of values");
        int n=s.nextInt();
        System.out.println("Now enter the values of the array");
        int a[]= new int [n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        } 
        incrementor(a);
    }
}
