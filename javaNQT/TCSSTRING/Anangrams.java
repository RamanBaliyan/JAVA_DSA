package javaNQT.TCSSTRING;
import java.util.*;
public class Anangrams {
    public static void main(String[] args) {
        String s="Raman";
        String s1="manRa";
        int len1=s.length();
        int len2=s1.length();
        boolean check=true;
        char [] c= s.toCharArray();
        char [] c1= s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
       if(len1!=len2){
        System.out.println("These are not the anagrams");
       }
       else{
        for(int i=0;i<len1;i++){
            if(c[i]!=c1[i]){
                check=false;
                break;
            }
            else{
                check=true;
            }
        }
        if(check==true){
            System.out.println("These strings are the anagrams");
        }
        else{
            System.out.println("These are not the anagrams");
        }
       }
        
    }
}
