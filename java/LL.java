public class LL {
    int size;
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
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addlast("b");
        list.print();
        list.addFirst("c");
        list.print();
        list.addlast("Raman");
        list.print();
        list.firstDelete();
        list.lastDelete();
        list.print();
        list.getsize();
        list.addlast("Raman");
        list.print();
        list.getsize();
    }
    
}
