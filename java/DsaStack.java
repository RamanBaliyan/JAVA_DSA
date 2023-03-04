public class DsaStack {
   static class node{
        int i;
        node next;

     
   node(int i)
        {
        this.i= i;
        next = null;
        }
}
    static class stack{
       public static node head = null;
       
        public static void Push(int i)
        {   
         node newnode= new node(i);
            if(head==null){
                head = newnode;
                return;
            }
            
            newnode.next=head;
            head=newnode;
        }
        public static boolean IsEmpty() {
            return head == null;
        }
        public static int Pop(){
           
            if(IsEmpty()){
                return -1;
            }
            int top=head.i;
             head=head.next;
         return top;
        }
        public static int peek(){
            if(IsEmpty()){
                return -1;
        }
        return head.i;
    }
    }
    
    public static void main(String[] args) {
        stack St = new stack ();
        St.Push(1);
        St.Push(2);
        St.Push(3);
        St.Push(4);
        St.Push(4);
        St.Push(51);
        St.Push(6);
        St.Push(16);
        while(!St.IsEmpty()){
            System.out.println(St.peek());
        
        St.Pop();
        }
    }
}
