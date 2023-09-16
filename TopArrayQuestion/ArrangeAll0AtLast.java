package TopArrayQuestion;

public class ArrangeAll0AtLast {
    public static void main(String[] args) {
        int a[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n=a.length;
        int ans[]= new int [n];
        int last=a.length-1;
        int start=0;
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==0){
        //        ans[last]=a[i];
        //        last--;
        //     }
        //     else{
        //         ans[start]=a[i];
        //         start++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(ans[i] +" ");
        // }
        // it is a optimize approach but we can also solve without using the space 
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        // if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        // return a;
    }
}
