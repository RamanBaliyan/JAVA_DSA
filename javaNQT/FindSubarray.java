package javaNQT;

import java.util.Arrays;
import java.util.Scanner;

public class FindSubarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the  first array");
        int n= sc.nextInt();
        System.out.println("Enter the length of the second array");
        int m= sc.nextInt();
        int a1[] = new int [n];
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        int a2[] = new int [m];
        System.out.println("Enter the elements of the second array");
         for(int j=0;j<m;j++){
            a2[j]=sc.nextInt();
        }
        boolean check = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a1[i]==a2[j]){
                    check=true;  
                }
                }
                if(check == false ){
                    System.out.println("Array a1 is not the subarray of the a2");
                    break;

            }
        }
        System.out.println("A1 is the subarray of the A2");
//         static boolean bSearch(int elem, int arr[], int n) {
//     int start = 0;
//     int end = n - 1;
//     while (start <= end) {
//       int mid = (start + end) / 2;
//       if (arr[mid] == elem)
//         return true;
//       else if (arr[mid] < elem)
//         start = mid + 1;
//       else end = mid - 1;
//     }
//     return false;
//   }

//   static boolean isSubset(int arr1[], int m, int arr2[], int n) {
//     if (m > n) return false;
//     Arrays.sort(arr2);
//     for (int i = 0; i < m; i++) {
//       boolean present = bSearch(arr1[i], arr2, n);
//       if (present == false) return false;
//     }
//     return true;
//     }
    
}
