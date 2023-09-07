package javaNQT;
import java.util.*;
public class reverseByKelement {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7};
    int n=a.length;
    int element=3;
    reverse(a,n,element);
    }
    

static void reverse(int ar[],int n,int element){
    int res[]=new int [n];
    int j=0;
    for(int i=element;i<n;i++){
        res[j]=ar[i];
        j++;
    }
    for(int i=0;i<element;i++){
        res[j]=ar[i];
        j++;
    }
    for(int i=0;i<n;i++){
    System.out.print(res[i]);
    }
    }
}
