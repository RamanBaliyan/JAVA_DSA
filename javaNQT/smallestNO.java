package javaNQT;
import java.util.*;
public class smallestNO {
    public static void main(String[] args) {
        int ar[]={23,4,5,6,3,5,6,4,6};
        int n= ar.length;
        //using the arrays.sort function;
        Arrays.sort(ar);
        System.out.println(ar[0]);
        System.out.println(ar[n-1]);
        //second smallest and second largest number in the array
        System.out.println(ar[1]);
        System.out.println(ar[n-2]);
    }
}
