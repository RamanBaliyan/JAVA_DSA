package arrayQuestions;

public class SumSubarray {
    public static void SumOfSubarray(int a[],int n,int s){
        int sum=0;
        int start=0;
        int flag=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            while(sum>s){
                sum=sum-a[start];
                start++;
            }
            if(sum==s){
                System.out.println(start+1);
                System.out.println(i+1);
                flag=1;
                break;

            }
        }
        if(flag==0){
            System.out.println("sum not found");
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,5,3,2,7};
        SumOfSubarray(a,6,12);

        
    }
}
