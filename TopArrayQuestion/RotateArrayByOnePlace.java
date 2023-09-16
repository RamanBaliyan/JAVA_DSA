package TopArrayQuestion;
public class RotateArrayByOnePlace {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int temp=ar[0];
        int n= ar.length;
        for(int i=1;i<n;i++){
           ar[i-1]=ar[i];

        }
        ar[n-1]=temp;
        for(int i=0;i<n;i++){
        System.out.print(ar[i]);
        // This is the optimial solution for this problem.
        }
    }
}
