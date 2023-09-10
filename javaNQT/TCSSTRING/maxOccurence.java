package javaNQT.TCSSTRING;

public class maxOccurence {
    
    static char maxOccurringChar(String str) {
        char ans = 'a';
        int maxfreq = 0, n = str.length();
        int count[] = new int[256];
        for (int i = 0; i < n; i++) {
           count[str.charAt(i)]++;
           if (count[str.charAt(i)] > maxfreq) {
              maxfreq = count[str.charAt(i)];
              ans = str.charAt(i);
           }
        }
        return ans;
     }
     public static void main(String[] args) {
        String str = "takeuforward";
        System.out.println("Maximum occurring character is " + maxOccurringChar(str));
     }
}
