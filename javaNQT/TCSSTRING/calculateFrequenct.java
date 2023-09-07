package javaNQT.TCSSTRING;
import java.util.*;

public class calculateFrequenct {
    public static void main(String[] args) {
          String s= "Raman Baliyan";
          char[]input=s.toCharArray();
        Map<Character,Integer>s1=new HashMap<>();
      
        for(Character x : input){
            if(s1.containsKey(x)){
                s1.put(x,s1.get(x)+1);
            }
            else{
                s1.put(x,1);
            }
        }
        for ( Map.Entry entry : s1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
