package javaNQT.TCSSTRING;

public class RemoveSpace {
    public static void main(String[] args) {
        String str="My name is Raman Baliyan";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str=str.substring(0,i)+str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
