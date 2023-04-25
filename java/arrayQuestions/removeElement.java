package arrayQuestions;
import java.util.*;

public class removeElement {

    public static void Remover(int a[],int target){
     int len=a.length;
     for(int i=0;i<len;i++){
        if(a[i]==target){
            a[i]=0;
        }
  
     }
     System.out.println("Output array will be");
     for(int i=0;i<len;i++){
        System.out.println(a[i]);
     }

  
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
        Remover(a,target);

        
    }
}


