package javaNQT;

/**
 * maximumProduct
 */
public class maximumProduct {

    public static void main(String[] args) {
        int ar[]={1,2,-3,4,3,-5};
        int c=0;
        int n=0;
        int len=ar.length;
        int ans= Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(c==0) c=1;
            if(n==0) n=1;
            c*=ar[i];
            n*=ar[len-i-1];
            ans=Math.max(ans,Math.max(c,n));
        }
        System.out.println(ans);

    }
}