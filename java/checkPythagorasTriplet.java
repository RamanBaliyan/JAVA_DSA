import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class checkPythagorasTriplet {
    static boolean checkTriplet(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
      
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]*arr[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.contains(arr[i]*arr[i]+arr[j]*arr[j])){
                    System.out.println("Yes pythagoras triplet is presenet in the array");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a={2,3,4,5,5,6,7};
        int n=a.length;
        checkTriplet(a,n);
    }
}

