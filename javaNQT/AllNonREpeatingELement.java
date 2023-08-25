package javaNQT;
import java.util.*;
import java.util.Scanner;

public class AllNonREpeatingELement {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Set<Integer> s1= new HashSet<>();
        for(int x : a){
            if(!s1.contains(x)){
                s1.add(x);
                System.out.println(x);
            }
        }
        

    }
}
