package javaNQT;
import java.util.*;
public class countFrequency {
    public static void main(String[] args) {
        int a[]={ 2,3,4,5,3,24,5,3,4,5,34,3,4,3,4,3,3,3,3,3};
        countFrequency(a,3);
    }
    static void countFrequency( int a[],int s){
        int n= a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==s){
                count++;
            }
        }
        System.out.println(count);
    }
}
