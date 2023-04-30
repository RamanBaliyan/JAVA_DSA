package arrayQuestions;
import java.util.*;
public class RearangeArrayAlternatively {
        public static void rearrange(long arr[], int n){
        
            // Your code here
            int l=0;int r=n-1;
            long mod=1000001;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    long newValue=arr[r]%mod;
                    arr[i]=newValue*mod+arr[i];
                    r--;
                }
                else{
                    long newValue = arr[l]%mod;
                    arr[i]=newValue*mod+arr[i];
                    l++;
                }
            }
            for(int i=0;i<n;i++){
                arr[i]=arr[i]/mod;
            }
            
        }
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
         System.out.println("Enter the no of values");
         int n=s.nextInt();
         System.out.println("Now enter the values of the array");
        long arr[]= new long [n];
         for(int i=0;i<n;i++){
             arr[i]=s.nextInt();
         } 
        
         rearrange(arr,n);
    }
    
}
