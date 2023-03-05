import java.util.*;
public class StackBottom {
    public static void pushbottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbottom(data,s);
        s.push(top);
    }
public static void reverse(Stack<Integer>s){
    if(s.isEmpty()){
        return;
    }
    int top=s.pop();
    reverse(s);
    pushbottom(top,s);
}
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(19);
        s.push(39);
        s.push(167);
        reverse(s);
        System.out.println(s);
    }
    
}
