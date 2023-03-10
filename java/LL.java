public class LL {
    
    int size=0;
    node head;
    class node{
        String data;
        node next;

    node(String data){
        this.data=data;
        this.next=null;
        size++;
    }
    }
    public void addFirst(String data){
        node newnode = new node(data);
        if(head ==null)
        {
            head = newnode;
            return;

        }
        newnode.next= head;
        head = newnode;
        
    }
    public void addlast(String data){
    node newnode = new node(data);
    if(head == null)
        {
            head = newnode;
            return;

        }
    node currnode=head; 
    while(currnode.next!=null){
        currnode = currnode.next;}

    currnode.next=newnode; 
      
    }
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
    
        node currnode = head; 
        while(currnode!=null){
        System.out.print(currnode.data + "->");
        currnode = currnode.next;
        } 
        System.out.println("NULL");
    }
    public void firstDelete(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        size--;
    }
    public void lastDelete(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node secondlast=head;
        node last=head.next;//head.next=null-.> to null.next error dega
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public void getsize(){
        System.out.println(size);
    }
    public void reverseString(){
        if(head == null || head.next==null){
            return;
        }
        node prevNode = head;
        node currNode = head.next;
        while(currNode!=null){
            node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode; 
    }
    public node remove(int n)
    {
        
        if(head.next==null){
            System.out.println("null");
            
        }
         
        for(int i=1;i<size-n;i++){
            head=head.next;
            
        }
        head.next=head.next.next;
        return head;
    
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addlast("b");
        list.print();
        list.addFirst("c");
        list.print();
        list.addlast("Raman");
        list.print();
     //   list.firstDelete();
       // list.lastDelete();
      //  list.print();
        list.getsize();
        list.addlast("baliyan");
        list.print();
        list.getsize();
        //list.reverseString();
       // list.print();
        list.remove(2);
        list.print();
    }
    
}
