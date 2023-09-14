package javaNQT.TCSSTRING;
import java.util.*;
public class PRACTICE {
    public static void main(String[] args) {
        int [] a={2,3,4,5,6};
        int n= a.length;
       // ArrayList<Integer> ishu=new ArrayList<>();
       Set<Integer>s= new HashSet<Integer>();
       Map<Character,Integer> m= new HashMap<>();

        for(int x : a){
          s.add(x);
           }
           for(int x : s){
            if(x==5){
                System.out.println("Number 5 is present");
            }
           }
        }
        

}    

