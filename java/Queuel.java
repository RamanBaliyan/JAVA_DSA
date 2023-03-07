public class Queuel {
    static class Queue{
        static int arr[];
        static int size;
       static int rear = -1;
        Queue(int n ){
            arr = new int[n];
            this.size=n;


        }
        public static Boolean isEmpty(){
            {
                return(rear==-1); 
            }
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
           arr[rear]=data;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                 arr[i]=arr[i+1];

            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            int front =arr[0];
            return front;
            

        }
    }
    public static void main(String[] args) {
        Queue Q = new Queue(8);
        Q.add(1);
        Q.add(2);
        Q.add(31);
        Q.add(41);
        Q.add(5);
        while(Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();

        }
        


    }

    
}
