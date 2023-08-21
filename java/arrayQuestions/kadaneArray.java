package arrayQuestions;

public class kadaneArray {

    public static void main(String[] args) {
        int a[]={2,67,-1,34,-56};
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
