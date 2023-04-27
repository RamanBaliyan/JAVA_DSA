package arrayQuestions;
import java.util.*;

public class findTriplets {
        public static int countTriplet(int arr[], int n) {
             // code here
             int count=0;
             Arrays.sort(arr);
             for(int i=arr.length;i>=2;i--){
                 int r=i-1;
                 int l=0;
                 
                 while(l < r){
                     if(arr[i]==arr[l]+arr[r]){
                         count++;
                     }
                     else if(arr[i]>arr[l]+arr[r]){
                         l++;
                     }
                     else{
                         r--;
                     }
                 }
             }
             return count;
         }
           public void main(String[] args){
             Scanner s= new Scanner(System.in);
                 int n= s.nextInt();
                 int arr[] = new int[n];
                 for(int i=0;i<n;i++){
                     arr[i]= s.nextInt();
                 }
                 int c=countTriplet(arr,n);
                 System.out.println(c);
             }
     }
     
    

