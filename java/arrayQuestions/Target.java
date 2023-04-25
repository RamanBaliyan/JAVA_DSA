package arrayQuestions;
import java.util.*;

public class Target {
    public static void finder(int a[],int target){
        int f=-1;
        int l=-1;
        int len=a.length;
        for(int i=0; i<len;i++){
            
            if(a[i]==target){
                if(f == -1){
                    f=i;
                }
                else{
                    l=i;
                }
            }
        }
        System.out.println(f);
        System.out.println(l);

    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the target value");
        int target=s.nextInt();
        System.out.println("Enter the no of values");
        int n=s.nextInt();
        System.out.println("Now enter the values of the array");
        int a[]= new int [n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        finder(a,target);

        
    }
}
