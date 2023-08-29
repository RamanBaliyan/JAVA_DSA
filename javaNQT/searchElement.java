package javaNQT;
import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int element= sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }   
        int first=0;
        int temp=-1;
        int last=a.length-1;
        while(first <= last){
            int mid=(first + last)/2;
            if(a[mid]==element){
                    temp=mid;
                    break;
            }
            else if(a[mid] < element){
                first=mid+1;
            }
            else if(a[mid] > element){
                last = mid-1;
            }
        }
        System.out.println("Element is found at the index of " + temp);
    }
}
