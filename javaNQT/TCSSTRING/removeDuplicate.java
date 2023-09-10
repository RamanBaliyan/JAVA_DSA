package javaNQT.TCSSTRING;
import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        String  s ="Raman baliyan";
    int len=s.length();
        char [] c= s.toCharArray();
        Map<Character,Integer> m= new HashMap<>();
        for(Character i : c){
        
        if(m.containsKey(i)){
            m.put(i,m.get(i)+1);
        }  
        else{
            m.put(i,1);
        }

    }
     for (Character i : m) {
        if(m.getValue(i)>1){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        

  }
    }
}
