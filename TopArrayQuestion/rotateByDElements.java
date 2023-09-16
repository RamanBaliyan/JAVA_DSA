package TopArrayQuestion;

public class rotateByDElements {
    
        public static void rotate(int[] nums, int k) {
            k %= nums.length;
            int n = nums.length;
            reverseNum(nums,0,n-1);
            reverseNum(nums,0,k-1);
            reverseNum(nums,k,n-1);
        }
        public static void reverseNum(int[] nums, int start, int end) {
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        public static void main(String[] args) {
            int a[]={1,2,3,4,5,6};
            int d=2;
            rotate(a,d);
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]);
            }
        }
    }

