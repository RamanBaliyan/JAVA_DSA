package javaNQT;

public class reverseArray {
    public static void main(String[] args) {
        
        int A[]= { 2,3,42,1,4,56,42,4};
        int n=  A.length;
        int reverse []= new int [n];
        for(int i=n-1;i>=0;i--){
            reverse[n-i-1] = A[i]; 
        }
        for(int i=0;i<n;i++){
            System.out.println(reverse[i]);
        }
    }
}
