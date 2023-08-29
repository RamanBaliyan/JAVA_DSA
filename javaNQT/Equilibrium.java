package javaNQT;

import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int len=a.length;
      
       
        // # this is  a brute force solution so we will optimize it as its complexity is n^2
        // int temp=-1;
        // for(int i=0;i<n;i++){
        //     rightSum=0;
        //     for(int j=0;i<i;j++){
        //         leftSum += a[j];
        //     }
        //     for(int j=i+1;j<n;j++){
        //         rightSum += a[j];
        //     }
        //     if(leftSum==rightSum){
        //        temp = i;
        //     }
        // }
        // System.out.println(temp);
       // now we will find the total sum and put it equal to the right sum and substract every element from the rightSum and add into the left sum and check whether it is equal or not
       int totalSum=0;
       for(int i=0;i<n;i++){
            totalSum += a[i];
       }
       int leftSum = 0;
      int rightSum=totalSum;
      for(int i=0;i<n;i++){
        rightSum = rightSum - a[i];
        
        if(leftSum == rightSum){
            System.out.println(i);
        }
        leftSum= leftSum + a[i];
      }
        
    }
}
