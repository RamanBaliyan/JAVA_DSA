package javaNQT.TCSSTRING;

public class Palindriome {
    public static void main(String[] args) {
        String s="TAKE U FORWARD";
        boolean check=false;
        int start=0,end=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(start)==s.charAt(end)){
                check=true;
                start++;
                end--;
            }
            else{
                check=false;
            }

        }
        if(check==true){
            System.out.println("This is a pallindrome");
        }
        else{
            System.out.println("This is not a pallindrome");
        }
    }
}
