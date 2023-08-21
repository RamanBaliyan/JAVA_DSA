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
    ArrayList<Integer>a1=new ArrayList<>();
    for(int i=element;i<n;i++){
        a1.add(ar[i]);
    }
    for(int i=0;i<element;i++){
        a1.add(ar[i]);
    }
    System.out.println(a1);
    }
}
