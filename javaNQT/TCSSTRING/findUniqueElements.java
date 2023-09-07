package javaNQT.TCSSTRING;
import java.util.*;
public class findUniqueElements {
     static void printFrequency(String st, int n) {
        int freq[] = new int[200];
        char s[] = st.toCharArray();
        for (int i = 0; i < n; i++) {
            if (st.charAt(i) == ' ') // ignoring the space in the string
                continue;
            else
                freq[(int) st.charAt(i)]++;//incrementing each character's frequency
        }

        // Printing the frequency of the string
        for (int i = 0; i < n; i++) {
            if (freq[(int) st.charAt(i)] == 1 && s[i] != ' ') {
                System.out.print(s[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String st = "take u forward";

        int n = st.length();

        System.out.print("Non-Repeating characters: ");
        printFrequency(st, n);

    }
       
           
        }
