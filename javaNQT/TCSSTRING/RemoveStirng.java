package javaNQT.TCSSTRING;

public class RemoveStirng {
    public static void main(String[] args) {
        String s = "Raman baliyan";
        int len=s.length();
        int right=len-1;
        int left=0;
        String temp="";
        while(right>=0){
            temp=temp+s.charAt(right);
            right--;
        }
        System.out.println(temp);
    }
}
