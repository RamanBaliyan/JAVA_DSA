package arrayQuestions;

public class kadaneArray {

    public static void main(String[] args) {
        int a[]={-1,-2,-3,-4,-5};
        int sum1=0;
        int sum2=a[0];
        for(int i=0;i<5;i++){
            sum1+=a[i];
            if(sum1>sum2){
                sum1=sum2;
            }
            if ( sum1<0){
                sum1=0;
            }
        
        }
        System.out.println(sum2);
    }
}
