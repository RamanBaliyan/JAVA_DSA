package javaNQT;
import java.util.*;
public class uniquenumber {

    public static void main(String[] args) {
        
        int a[]={3,4,5,64,2,4,5,3,5,53,4};
        unique(a);
    }
    static void unique(int ar[]){
        Set<Integer> s= new HashSet<>();
        ArrayList<Integer> a1=new ArrayList<>();
        for(int x: ar){
            
            if(!s.contains(x)){
                s.add(x);
                a1.add(x);
            }
        }
        System.out.println(a1);
    }
}
