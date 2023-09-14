package TopArrayQuestion;

public class Max1occurence {
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,1};
        int max=0;
        int temp=0;
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                max++;
                
            }
            else if(a[i]!=1) {
                max=0;
            }
             temp=Math.max(temp,max);
        }
            
        System.out.println(temp);
    }
}
