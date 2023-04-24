import javax.management.relation.RelationSupport;

public class secondLargest {
    public  static int SLargest(int arr[]){
        int l=arr.length;
        int s=-1;
        int largest=arr[0];
        for(int i=0;i<l-1;i++){
            if(arr[i]>largest){
                s=largest;
                largest=arr[i];

            }
            else if(arr[i]>s && arr[i]!=largest){
                s=arr[i];
            }
        }
        System.out.println(s);
        return 0;


    }
    
    public static void main(String[] args) {
        int arr[]= {2,3,8,9,5,5,9,6,4};
        SLargest(arr);
        
    }
    
}
