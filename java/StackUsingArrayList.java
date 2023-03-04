import java.util.*;
public class StackUsingArrayList {
    static class Stack{
    static ArrayList <Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;

    }
    public void push(int data){
      list.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
    }
        return list.get(list.size()-1);
        

}
  
    }

    public static void main(String[] args) {
        Stack St = new Stack ();
        St.push(1);
        St.push(2);
        St.push(3);
        St.push(4);
        St.push(4);
        St.push(51);
        St.push(6);
        St.push(16);
        while(!St.isEmpty()){
            System.out.println(St.peek());
        
        St.pop();
    }
    
    }
}
