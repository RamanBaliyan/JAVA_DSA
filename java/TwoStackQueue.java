import java.util.*;
public class TwoStackQueue {
    public static class TwoStack{
   static Stack<Integer> s1 = new Stack<>();
   static Stack<Integer> s2 = new Stack<>();
    public static boolean isEmpty(){
        return s1.isEmpty();
        }
        public static void add(int data){
            if(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            if(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();  
        }

    }
    
    public static void main(String[] args) {
         Queue <Integer> q= new ArrayDeque<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

       
        }
    
}
