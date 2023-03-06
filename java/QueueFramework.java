import java.util.*;
public class QueueFramework {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(8);
        while(q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
