package arrayQuestions;

public class MissingNymberArray {
    public static void MissingNumber(int array[], int n) {
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+array[i];
          
        }
        int osum=(n*(n+1))/2;
        System.out.println(osum-sum);
    }
    

    


    public static void main(String[] args) {
        int array []={1,2,3,4,5,6,8,9};
        MissingNumber(array,8);

// User function Template for Java


    
    
}
}


